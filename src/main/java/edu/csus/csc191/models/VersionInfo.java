package edu.csus.csc191.models;

public class VersionInfo {
	private String version;
	private int totalCount;
	private int storageCount;
	private int percent = 0;
	
	public VersionInfo(String version)
	{
		this.version = version;
	}
	
	public void updateTotalCount()
	{
		this.totalCount++;
	}
	
	public int getTotalCount()
	{
		return this.totalCount;
	}
	
	public void updateStorageCount()
	{
		this.storageCount++;
	}
	
	public int getStorageCount()
	{
		return this.storageCount;
	}
	
	public String getVersionNumber()
	{
		return this.version;
	}
	
	public void setPercent(int percent)
	{
		this.percent = percent;
	}
	
	public int getPercent()
	{
		return this.percent;
	}
	
	public String toString()
	{
		return String.format("Version %s - Total Count: %d -- Storage Count: %d", version, totalCount, storageCount);
	}
}
