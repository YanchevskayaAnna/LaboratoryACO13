import controller.LoginWindowController;
import model.LaboratoryDB;
import view.LoginPassFrame;

public class RunApp {
    public static void main(String[] args) {

        LaboratoryDB laboratoryDB = new LaboratoryDB();
        LoginPassFrame loginPassFrame = new LoginPassFrame(new LoginWindowController(laboratoryDB));

    }

}
