package edu.csus.csc191.models.Reports;

import edu.csus.csc191.models.interfaces.IReport;

public class CustomerEnvironmentSizeReport extends MasterReport implements IReport {

    private String EnvName;
    private int Total;
    private float Average;
    private int Max;
    public String getEnvName() {
        return EnvName;
    }
    public void setEnvName(String envName) {
        EnvName = envName;
    }
    public int getTotal() {
        return Total;
    }
    public void setTotal(int total) {
        Total = total;
    }
    public float getAverage() {
        return Average;
    }
    public void setAverage(float average) {
        Average = average;
    }
    public int getMax() {
        return Max;
    }
    public void setMax(int max) {
        Max = max;
    }
    static {
        System.out.println(" -- Initializing CustomerEnvironmentSizeReport.");
    }
}
