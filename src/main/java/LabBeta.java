import controller.MedPersonalController;
import controller.MedPersonalControllerImpl;
import db.LaboratoryDB;
import exceptions.RegisterException;
import model.Position;
import utils.DBUtils;

import java.io.IOException;
import java.time.LocalDate;

/**
 * Created by gorobec on 17.07.16.
 */
public class LabBeta {
    public static void main(String[] args) throws RegisterException, IOException {

        LaboratoryDB db = new LaboratoryDB();
        MedPersonalController controller = new MedPersonalControllerImpl(db);

        /*controller.register("Adam", "Smith", LocalDate.of(0, 1, 1), "+38093777-77-77", "adam@gmail.com", "admin", "admin", Position.HEAD);
        DBUtils.save(db);*/
    }
}
