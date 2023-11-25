public class Employee extends Customer{
    private int EmplyeeID;
    private double Discount;
    private double Wage;
    private int HoursWorked;
    private String[] Order;
    public Employee(String name, int employeeID, double discount, double Wage, int hoursWorked){
        super(name);
        this.EmplyeeID=employeeID;
        this.Discount=discount;
        this.HoursWorked=hoursWorked;
        this.Wage=Wage;
    }
    public Employee(String name, int employeeID, double discount, double Wage){
        super(name);
        this.EmplyeeID=employeeID;
        this.Discount=discount;
        this.Wage=Wage;
    }
    public double getDiscount() {
        return Discount;
    }
    public void setDiscount(double discount) {
        Discount = discount;
    }
    public int getEmplyeeID() {
        return EmplyeeID;
    }
    public void setEmplyeeID(int emplyeeID) {
        EmplyeeID = emplyeeID;
    }
    @Override
    public String getName() {
        return super.getName();
    }
    public void setName(String name) {
        super.setName(name);
    }
    public void addOrder(String item) {
        super.addOrder(item);
    }
    public void printReceipt() {
        super.printReceipt();
    }
}
