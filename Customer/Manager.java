public class Manager extends Employee{
    private String[] Invoice;
    private String[] Order;
    public Manager(String name, int employeeID, double discount, double Wage){
        super(name, employeeID,discount,Wage);
    }

    @Override
    public String getName() {
        return super.getName();
    }
    public void setName(String name) {
        super.setName(name);
    }
    public int getEmplyeeID() {
        return super.getEmplyeeID();
    }
    public void setEmplyeeID(int emplyeeID) {
        super.setEmplyeeID(emplyeeID);
    }
    public double getDiscount() {
        return super.getDiscount();
    }
    public void setDiscount(double discount) {
        super.setDiscount(discount);
    }
    public void addOrder(String item) {
        super.addOrder(item);
    }
    public void printReceipt() {
        super.printReceipt();
    }
    public void printInvoice(){

    }
    public void createInvoice(){

    }
}
