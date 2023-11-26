public class StrawberryLemonade extends Drink {

    public StrawberryLemonade(String size) {
        super("Strawberry Lemonade", size, 3.49);
        if(this.getSize().equals("Large")){
            Inventory.subtractSugar(3);
            Inventory.subtractLemons(3);
            Inventory.subtractStrawberries(3);
        }
        else if(this.getSize().equals("Small")){
            Inventory.subtractStrawberries(1);
            Inventory.subtractLemons(1);
            Inventory.subtractSugar(1);
        }
        else{
            Inventory.subtractSugar(2);
            Inventory.subtractLemons(2);
            Inventory.subtractStrawberries(2);
        }
    }
}
