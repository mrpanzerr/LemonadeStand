public class Drink {

    private String flavor;
    private String size;
    private double price;

    public Drink(String flavor, String size, double price) {

        this.flavor = flavor;
        this.size = size;
        this.price = price;
    }
    public Drink(){
        this.flavor = "Lemonade";
        this.size = "Medium";
        this.price = 2.99;
    }
    public double getPrice(){
        if(this.getSize().equals("Large")){
            return this.price * 1.25;
        }
        else if(this.getSize().equals("Small")){
            return this.price * 0.75;
        }
        else{
            return this.price;
        }
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
}