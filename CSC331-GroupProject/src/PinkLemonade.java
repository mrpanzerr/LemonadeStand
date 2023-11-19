public class PinkLemonade extends Drink {

    private double price = 3.99;

    public PinkLemonade(String size) {
        super("Pink Lemonade", size);
        if(this.getSize().equals("Large")){
            Inventory.subtractSugar(2);
            Inventory.subtractLemons(2);
            Inventory.subtractPinkLemonadeExtract(2);
        }
        else{
            Inventory.subtractSugar(1);
            Inventory.subtractLemons(1);
            Inventory.subtractPinkLemonadeExtract(1);
        }
    }
    public double getPrice(){
        if(this.getSize().equals("Large")){
            return this.price * 1.25;
        }
        else{
            return this.price;
        }
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
}