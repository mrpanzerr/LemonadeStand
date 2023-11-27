public class NormalLemonade extends Drink {

    // Constructor for NormalLemonade, takes size as a parameter
    public NormalLemonade(String size) {
        // Call the constructor of the superclass (Drink) with default flavor ("Lemonade"), size, and price
        super("Lemonade", size, 2.99);

        // Adjust inventory based on the size of the lemonade being created
        if (this.getSize().equals("Large")) {
            // Subtract 3 units of sugar and 3 lemons for a Large lemonade
            Inventory.subtractSugar(3);
            Inventory.subtractLemons(3);
        } else if (this.getSize().equals("Small")) {
            // Subtract 1 unit of sugar and 1 lemon for a Small lemonade
            Inventory.subtractLemons(1);
            Inventory.subtractSugar(1);
        } else {
            // Subtract 2 units of sugar and 2 lemons for a Medium (default) lemonade
            Inventory.subtractSugar(2);
            Inventory.subtractLemons(2);
        }
    }
}
