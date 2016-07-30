package controller;


import model.Report;

import java.util.List;

public interface AssistantController {
    /**
     *
     * show all Reports in Assistants DB
     * */
    List<Report> showReports();
    /**
     * add new reports with status NEW to Assistant DB
     * */
    boolean takeNewReports();

}
