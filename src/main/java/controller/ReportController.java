package controller;

import model.Analysis;
import model.Result;

import java.util.List;
import java.util.Map;

/**
 * Created by gorobec on 17.07.16.
 */
public interface ReportController {

    void addConclusion(String conclusion);
    Map<Analysis, Result> showAnalysis();


}
