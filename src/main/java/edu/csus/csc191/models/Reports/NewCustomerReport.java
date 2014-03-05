package edu.csus.csc191.models.Reports;

public class NewCustomerReport extends MasterReport {

    private int AllCustomer;
    private int StorageCustomer;
    private int ServerCustomer;
    public int getAllCustomer() {
        return AllCustomer;
    }
    public void setAllCustomer(int allCustomer) {
        AllCustomer = allCustomer;
    }
    public int getStorageCustomer() {
        return StorageCustomer;
    }
    public void setStorageCustomer(int storageCustomer) {
        StorageCustomer = storageCustomer;
    }
    public int getServerCustomer() {
        return ServerCustomer;
    }
    public void setServerCustomer(int serverCustomer) {
        ServerCustomer = serverCustomer;
    }

    static {
        System.out.println(" -- Initializing NewCustomerReport.");
    }
}
