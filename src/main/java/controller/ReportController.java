package controller;

import model.Analysis;
import model.Result;
import model.Status;

import java.util.List;
import java.util.Map;
//todo state pattern
public interface ReportController {

    boolean addConclusion(String conclusion);

    Map<Analysis, Result> showAnalysis();

    boolean addResult(Analysis analys, Result result);

    boolean changeStatus(Status status);



}
