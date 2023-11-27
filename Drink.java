public class Drink {

    // Instance variables 
    private String flavor;
    private String size;
    private double price;

    // Constructor
    public Drink(String flavor, String size, double price) {
        this.flavor = flavor;
        this.size = size;
        this.price = price;
    }

    // Default constructor
    public Drink() {
        this.flavor = "Lemonade";
        this.size = "Medium";
        this.price = 2.99;
    }

    // Method to calculate and return the price based on size
    public double getPrice() {
        if (this.getSize().equals("Large")) {
            // Increase price by 25% for Large size
            return this.price * 1.25;
        } else if (this.getSize().equals("Small")) {
            // Decrease price by 25% for Small size
            return this.price * 0.75;
        } else {
            // Default price for other sizes
            return this.price;
        }
    }

    // Method to set a new price for the drink
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    // Getter method for flavor
    public String getFlavor() {
        return flavor;
    }

    // Setter method for flavor
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    // Getter method for size
    public String getSize() {
        return size;
    }

    // Setter method for size
    public void setSize(String size) {
        this.size = size;
    }
}
