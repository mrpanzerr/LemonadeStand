public class StrawberryLemonade extends Drink {

    // Constructor for StrawberryLemonade, takes size as a parameter
    public StrawberryLemonade(String size) {
        // Call the constructor of the superclass (Drink) with specified flavor ("Strawberry Lemonade"), size, and price
        super("Strawberry Lemonade", size, 3.49);

        // Adjust inventory based on the size of the strawberry lemonade being created
        if (this.getSize().equals("Large")) {
            // Subtract 3 units of sugar, 3 lemons, and 3 units of strawberries for a Large strawberry lemonade
            Inventory.subtractSugar(3);
            Inventory.subtractLemons(3);
            Inventory.subtractStrawberries(3);
        } else if (this.getSize().equals("Small")) {
            // Subtract 1 unit of sugar, 1 lemon, and 1 unit of strawberries for a Small strawberry lemonade
            Inventory.subtractStrawberries(1);
            Inventory.subtractLemons(1);
            Inventory.subtractSugar(1);
        } else {
            // Subtract 2 units of sugar, 2 lemons, and 2 units of strawberries for a Medium (default) strawberry lemonade
            Inventory.subtractSugar(2);
            Inventory.subtractLemons(2);
            Inventory.subtractStrawberries(2);
        }
    }
}
