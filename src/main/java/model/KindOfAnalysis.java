package model;

public enum KindOfAnalysis {
    EXACERBATION_OF_ARROGANCE(1),
    CURVATURE_OF_CONSCIENCE(2),
    CHRONIC_APATHY(3),
    DEBT_AMNESIA(1),
    LOVE(2),
    INFLAMMATION_OF_TRICKS(4);

    private int amountOfDays;

    KindOfAnalysis(int amountOfDays) {
        this.amountOfDays = amountOfDays;
    }

    public int getAmountOfDays() {
        return amountOfDays;
    }

}
