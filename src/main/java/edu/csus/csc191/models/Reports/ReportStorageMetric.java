package edu.csus.csc191.models.Reports;

public class ReportStorageMetric {
	private String name;
	private int totalPageViews;
	private int customerPageViews;
	private double customersViewingPagePercent;
	private double averagePageViews;
	private double averageTime;
	
	public ReportStorageMetric(String name)
	{
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalPageViews() {
		return totalPageViews;
	}
	public void setTotalPageViews(int totalPageViews) {
		this.totalPageViews = totalPageViews;
	}
	public double getCustomersViewingPagePercent() {
		return customersViewingPagePercent;
	}
	public void setCustomersViewingPagePercent(double customersViewingPagePercent) {
		this.customersViewingPagePercent = customersViewingPagePercent;
	}
	public int getCustomerPageViews() {
		return customerPageViews;
	}
	public void setCustomerPageViews(int customerPageViews) {
		this.customerPageViews = customerPageViews;
	}
	public double getAveragePageViews() {
		return averagePageViews;
	}
	public void setAveragePageViews(double averagePageViews) {
		this.averagePageViews = averagePageViews;
	}
	public double getAverageTime() {
		return averageTime;
	}
	public void setAverageTime(double averageTime) {
		this.averageTime = averageTime;
	}
}
