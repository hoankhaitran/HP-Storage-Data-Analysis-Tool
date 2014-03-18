package edu.csus.csc191.models.Reports;

public class VersionInformationReport extends MasterReport
{
	private String columnName;
	private String versionNumber;
	private int customerCount;
	private int storageCount;
	private int percent;
	
	public VersionInformationReport()
	{
		
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	public int getCustomerCount() {
		return customerCount;
	}

	public void setCustomerCount(int customerCount) {
		this.customerCount = customerCount;
	}

	public int getStorageCount() {
		return storageCount;
	}

	public void setStorageCount(int storageCount) {
		this.storageCount = storageCount;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}
	
	
}
