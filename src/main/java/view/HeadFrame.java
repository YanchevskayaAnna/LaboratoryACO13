package view;

import controller.HeadController;
import model.Head;
import model.LaboratoryDB;

public class HeadFrame {

    private HeadController headController;
    private LaboratoryDB laboratoryDB;
    private Head head;

    public HeadFrame(HeadController headController, Head head) {
        this.head = head;
        this.headController = headController;
        this.laboratoryDB = headController.getLaboratoryDB();
    }
}
