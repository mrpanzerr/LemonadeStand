public class NormalLemonade extends Drink {

    public NormalLemonade(String size) {
        super("Lemonade", size, 2.99);
        if(this.getSize().equals("Large")){
            Inventory.subtractSugar(3);
            Inventory.subtractLemons(3);
        }
        else if(this.getSize().equals("Small")){
            Inventory.subtractLemons(1);
            Inventory.subtractSugar(1);
        }
        else{
            Inventory.subtractSugar(2);
            Inventory.subtractLemons(2);
        }
    }
}
