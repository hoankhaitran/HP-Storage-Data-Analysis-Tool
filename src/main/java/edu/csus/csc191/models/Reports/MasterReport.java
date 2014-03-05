package edu.csus.csc191.models.Reports;

import java.util.ArrayList;

import edu.csus.csc191.models.interfaces.IReport;

public class MasterReport implements IReport {

    private String ReportName;
    private ArrayList<IReport> reports;
    public void setReportName(String reportName) {
        ReportName = reportName;
    }
    @Override
    public String getReportName() {
        return ReportName;
    }
    public ArrayList<IReport> getReports() {
        return reports;
    }
    public void setReports(ArrayList<IReport> reports) {
        this.reports = reports;
    }

    static {
        System.out.println(" -- Initializing MasterReport.");
    }
}
