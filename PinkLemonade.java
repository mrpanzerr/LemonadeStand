public class PinkLemonade extends Drink {

    public PinkLemonade(String size) {
        super("Pink Lemonade", size, 3.49);
        if(this.getSize().equals("Large")){
            Inventory.subtractSugar(3);
            Inventory.subtractLemons(3);
            Inventory.subtractPinkLemonadeExtract(3);
        }
        else if(this.getSize().equals("Small")){
            Inventory.subtractPinkLemonadeExtract(1);
            Inventory.subtractLemons(1);
            Inventory.subtractSugar(1);
        }
        else{
            Inventory.subtractSugar(2);
            Inventory.subtractLemons(2);
            Inventory.subtractPinkLemonadeExtract(2);
        }
    }
}
