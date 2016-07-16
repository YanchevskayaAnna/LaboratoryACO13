package view;

import controller.HeadController;
import model.Head;
import model.LaboratoryDB;

import javax.swing.*;

public class HeadFrame extends JFrame {

    private HeadController headController;
    private LaboratoryDB laboratoryDB;
    private Head head;

    public HeadFrame(HeadController headController, Head head) {
        this.head = head;
        this.headController = headController;
        this.laboratoryDB = headController.getLaboratoryDB();

        setTitle("Head view");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        init();
        setVisible(true);
    }

    private void init(){
        //TODO
    }
}
