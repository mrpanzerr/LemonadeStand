public class Customer {
    private String[] Order;
    private String Name;
    public Customer(String name){
        this.Name=name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public void addOrder(String item){
        String[] tempOrder = new String[this.Order.length + 1];
        for (int c = 0; c < this.Order.length; c++){
            tempOrder[c] = this.Order[c];
        }
        tempOrder[this.Order.length+1] = item;
        this.Order= tempOrder;
    }
    public void printReceipt() {
        int c;
        for (c = 0; c < this.Order.length; c++) ;
        System.out.println(this.Order[c]);
    }
}
