import controller.MedPersonalControllerImpl;
import db.LaboratoryDB;
import utils.DBUtils;
import view.LoginPassFrame;

import java.io.IOException;

public class RunApp {
    public static void main(String[] args) {

        LaboratoryDB laboratoryDB = null;
        try {
            laboratoryDB = DBUtils.read();
            LoginPassFrame loginPassFrame = new LoginPassFrame(new MedPersonalControllerImpl(laboratoryDB));
        } catch (IOException e) {
            e.printStackTrace();
//            todo can't connect to server frame
        }


    }

}
