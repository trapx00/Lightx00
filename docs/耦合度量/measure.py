import os,os.path, subprocess, re, time
ckjm_path = "./ckjm-1.9.jar"
out_paths = {"Client":"../../src/Lightx00.Client/out","Shared": "../../src/Lightx00.Shared/out","Server":"../../src/Lightx00.Server/out"}
output_file = "./耦合度量.md"
all_jars_path = "../../src/jars"

index = 1

def table_header(subindex, package):
    global index
    return ("""
### %d.%d %s包 

| 类 | WMC | DIT | NOC | CBO | RFC | LCOM | Ca | NPM |
|----| ----| ----| ----|----| ----|----|----|----|"""+"\n")% (index, subindex, package)

class Package():
    def __init__(self, package_name):
        self.class_items = []
        self.package_name = package_name
    def to_string(self, index):
        result = table_header(index, self.package_name)
        for class_item in self.class_items:
            result += str(class_item)+"\n"
        return result
    def add_classobj(self,classobj):
        self.class_items.append(classobj)


class ClassItem():
    def __init__(self):
        self.package = ""
        self.name = ""
        self.WMC = 0
        self.DIT = 0
        self.NOC =0 
        self.CBO = 0
        self.RFC = 0
        self.LCOM = 0
        self.Ca = 0
        self.NPM = 0
    def __str__(self):
        return "| %s | %d | %d | %d | %d | %d | %d | %d | %d |" % tuple(list(self.__dict__.values())[1:])

class_files = []

def populate_class_items(dir):
    for path in os.listdir(dir):
        abspath = os.path.join(dir,path)
        if os.path.isdir(abspath):
            populate_class_items(abspath)
        if os.path.isfile(abspath) and os.path.splitext(abspath)[1]==".class":
            class_files.append(abspath)

def command(project, path):
    return "java -Djava.ext.dirs=\"%s\" -jar %s \"%s\"" % (all_jars_path,ckjm_path, path)

start_time = time.time()

result = ""

package_map = {}

regex= "[a-zA-Z0-9\.]+\s\d\s\d\s\d\s\d\s\d\s\d\s\d\s\d"


def add_classobj(classobj):
    if not package_map.get(classobj.package):
        package_map[classobj.package] = Package(classobj.package)
    package_map[classobj.package].add_classobj(classobj)

for key, value in out_paths.items():
    print("processing project %s" % key)
    result += "## %d. %s项目" % (index,key)
    result += os.linesep
    populate_class_items(value)
    for filepath in class_files:
        print("processing file %s" % filepath)
        output = ""
        try:
            output = subprocess.check_output(command(key, filepath), shell=True).decode("ASCII")
        except subprocess.CalledProcessError as e:
            output = e.output.decode("ASCII")
        match = re.match(regex,output)
        if match:
            classobj = ClassItem()
            output_list = match.group().split()
            rindex = output_list[0].rindex(".")
            classobj.package = output_list[0][0:rindex]
            classobj.name = output_list[0][rindex+1:]
            classobj.WMC = int(output_list[1])
            classobj.DIT = int(output_list[2])
            classobj.NOC = int(output_list[3])
            classobj.CBO = int(output_list[4])
            classobj.RFC = int(output_list[5])
            classobj.LCOM = int(output_list[6])
            classobj.Ca = int(output_list[7])
            classobj.NPM = int(output_list[8])
            add_classobj(classobj)
    packages = list(package_map.values())
    for i in range(0, len(packages)):
        result+= packages[i].to_string(i+1)
    package_map.clear()
    class_files.clear()
    index+=1

end_time = time.time()

def format_time(t):
    return time.asctime(time.localtime(t))

result = """# Light x00 耦合度量

Generator started at %s, finished at %s.

Processing time: %.2f s

Generator by: Trap x00 Team

Thanks Diomidis Spinellis for his awesome [ckjm — Chidamber and Kemerer Java Metrics](https://www.spinellis.gr/sw/ckjm/).

## 0. 名词解释

WMC: Weighted methods per class

DIT: Depth of Inheritance Tree

NOC: Number of Children

CBO: Coupling between object classes

RFC: Response for a Class

LCOM: Lack of cohesion in methods

Ca: Afferent couplings

NPM: Number of public methods

""" % (format_time(start_time), format_time(end_time), end_time - start_time) + result

outputfile = open(output_file,'w',encoding="UTF-8")
outputfile.write(result)
outputfile.close()
    

