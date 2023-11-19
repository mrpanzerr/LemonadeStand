public class StrawberryLemonade extends Drink {

    private double price = 3.99;

    public StrawberryLemonade(String size) {
        super("Strawberry Lemonade", size);
        if(this.getSize().equals("Large")){
            Inventory.subtractSugar(3);
            Inventory.subtractLemons(2);
            Inventory.subtractStrawberries(3);
        }
        else{
            Inventory.subtractSugar(2);
            Inventory.subtractLemons(1);
            Inventory.subtractStrawberries(2);
        }
    }
    public double getPrice(){
        if(this.getSize().equals("Large")){
            return this.price * 1.25;
        }
        else{
            return this.price * 0.75;
        }
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
}