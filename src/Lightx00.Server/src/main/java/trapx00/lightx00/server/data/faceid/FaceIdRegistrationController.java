package trapx00.lightx00.server.data.faceid;

import com.j256.ormlite.dao.Dao;
import trapx00.lightx00.server.Server;
import trapx00.lightx00.server.data.faceid.factory.FaceIdDaoFactory;
import trapx00.lightx00.shared.exception.database.DbSqlException;
import trapx00.lightx00.shared.exception.database.IdNotExistsException;
import trapx00.lightx00.shared.exception.faceid.FileException;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.employee.EmployeeFaceIdInfo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;

public class FaceIdRegistrationController implements FaceIdRegistrationService {
    private Dao<EmployeeFaceIdInfo, String> dao = FaceIdDaoFactory.getDao();
    private static final String imgDir = "/faceIdImg/";
    private static final URL rootURL = Server.class.getResource(imgDir);
    private FaceIdService faceIdService = new FaceIdService();

    /**
     * Unregisters a employeeId.
     *
     * @param employeeId employee id
     * @return whether the unregistration is done successfully
     */
    @Override
    public ResultMessage unregister(String employeeId) {
        try {
            File file = new File(rootURL.getPath() + employeeId);
            if (!file.exists()) {
                file.createNewFile();
            }
            if (!file.exists() && dao.idExists(employeeId)) {
                throw new IdNotExistsException(employeeId);
            }
            dao.deleteById(employeeId);
            file.delete();
            return ResultMessage.Success;
        } catch (SQLException e) {
            throw new DbSqlException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResultMessage.Failure;
    }

    /**
     * Registers a picture with a Employee id.
     *
     * @param empl  oyeeId employee id
     * @param image      image in binary
     * @return whether the registration is done successfully
     */
    @Override
    public ResultMessage register(String employeeId, byte[] image) {
        try {
            String imgPath = rootURL.getPath() + employeeId;
            File file = new File(imgPath);
            if (file.exists()) {
                file.delete();
            }
            EmployeeFaceIdInfo info = new EmployeeFaceIdInfo(employeeId);
            dao.deleteById(employeeId);
            info.setImgUri(imgDir + employeeId);
            dao.create(info);
            try (FileOutputStream stream = new FileOutputStream(file)) {
                stream.write(image);
            }
            faceIdService.updateEmployeeFaceInfo(info);
            return ResultMessage.Success;
        } catch (SQLException e) {
            throw new DbSqlException(e);
        } catch (IOException e) {
            e.printStackTrace();
            throw new FileException(e);
        }
    }
}
