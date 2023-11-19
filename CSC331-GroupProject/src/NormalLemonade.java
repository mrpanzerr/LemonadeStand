public class NormalLemonade extends Drink {

    private double price = 2.99;

    public NormalLemonade(String size) {
        super("Lemonade", size);
        if(this.getSize().equals("Large")){
            Inventory.subtractSugar(3);
            Inventory.subtractLemons(3);
        }
        else{
            Inventory.subtractSugar(2);
            Inventory.subtractLemons(2);
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