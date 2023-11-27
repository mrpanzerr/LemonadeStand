public class PinkLemonade extends Drink {

    // Constructor for PinkLemonade, takes size as a parameter
    public PinkLemonade(String size) {
        // Call the constructor of the superclass (Drink) with specified flavor ("Pink Lemonade"), size, and price
        super("Pink Lemonade", size, 3.49);

        // Adjust inventory based on the size of the pink lemonade being created
        if (this.getSize().equals("Large")) {
            // Subtract 3 units of sugar, 3 lemons, and 3 units of pink lemonade extract for a Large pink lemonade
            Inventory.subtractSugar(3);
            Inventory.subtractLemons(3);
            Inventory.subtractPinkLemonadeExtract(3);
        } else if (this.getSize().equals("Small")) {
            // Subtract 1 unit of sugar, 1 lemon, and 1 unit of pink lemonade extract for a Small pink lemonade
            Inventory.subtractPinkLemonadeExtract(1);
            Inventory.subtractLemons(1);
            Inventory.subtractSugar(1);
        } else {
            // Subtract 2 units of sugar, 2 lemons, and 2 units of pink lemonade extract for a Medium (default) pink lemonade
            Inventory.subtractSugar(2);
            Inventory.subtractLemons(2);
            Inventory.subtractPinkLemonadeExtract(2);
        }
    }
}
