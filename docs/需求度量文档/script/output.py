
content = open("input.txt",encoding="UTF-8").read()

inputNum = content.count("**输入**")
outputNum = content.count("**输出**")
queryNum = content.count("**查询**")
fileNum = content.count("**逻辑文件**")
interfaceNum = content.count("**对外接口**")

total = 4*inputNum+5*outputNum+4*queryNum+10*fileNum+7*interfaceNum

stats = "输入：%d\n\n输出：%d\n\n查询：%d\n\n逻辑文件：%d\n\n对外接口：%d\n\n功能点测量总数：4×%d + 5×%d + 4×%d + 10×%d + 7×%d = %d\n\nFP =（4×%d + 5×%d + 4×%d + 10×%d + 7×%d）×（0.65 + 0.01*49）= %0.2f\n\n\n\n%s" % (inputNum, outputNum, queryNum, fileNum, interfaceNum, inputNum, outputNum, queryNum, fileNum, interfaceNum, (4*inputNum+5*outputNum+4*queryNum+10*fileNum+7*interfaceNum),inputNum, outputNum, queryNum, fileNum, interfaceNum, (4*inputNum+5*outputNum+4*queryNum+10*fileNum+7*interfaceNum)*(0.65+0.01*49), content)

open("output.txt",'w',encoding="UTF-8").write(stats)
