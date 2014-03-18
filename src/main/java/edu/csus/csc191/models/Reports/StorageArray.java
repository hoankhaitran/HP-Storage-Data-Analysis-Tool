package edu.csus.csc191.models.Reports;

public class StorageArray extends MasterReport
{
    private String arrayName;
    private Long customerCount;
    private Long arrayCount;
    private int percent;

    public String getArrayName() {
		return arrayName;
	}
	public void setArrayName(String arrayName) {
		this.arrayName = arrayName;
	}
	public Long getCustomerCount() {
		return customerCount;
	}
	public void setCustomerCount(Long customerCount) {
		this.customerCount = customerCount;
	}
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}
	public Long getArrayCount() {
		return arrayCount;
	}
	public void setArrayCount(Long arrayCount) {
		this.arrayCount = arrayCount;
	}
}
