public class Inventory {

    // Static variables to represent the quantities of different items in the inventory
    private static int lemons = 100;
    private static int strawberries = 100;
    private static int sugar = 1000;
    private static int pinkLemonadeExtract = 100;

    // Method to subtract a specified amount of lemons from the inventory
    public static void subtractLemons(int amount) {
        if (amount > 0 && amount <= lemons) {
            lemons -= amount;
        } else {
            System.out.println("Not enough lemons in inventory.");
        }
    }

    // Method to subtract a specified amount of strawberries from the inventory
    public static void subtractStrawberries(int amount) {
        if (amount > 0 && amount <= strawberries) {
            strawberries -= amount;
        } else {
            System.out.println("Not enough strawberries in inventory.");
        }
    }

    // Method to subtract a specified amount of sugar from the inventory
    public static void subtractSugar(int amount) {
        if (amount > 0 && amount <= sugar) {
            sugar -= amount;
        } else {
            System.out.println("Not enough sugar in inventory.");
        }
    }

    // Method to subtract a specified amount of pink lemonade extract from the inventory
    public static void subtractPinkLemonadeExtract(int amount) {
        if (amount > 0 && amount <= pinkLemonadeExtract) {
            pinkLemonadeExtract -= amount;
        } else {
            System.out.println("Not enough pink lemonade extract in inventory.");
        }
    }

    // Getter methods to retrieve the quantities of different items
    public int getSugar() {
        return sugar;
    }

    public int getStrawberries() {
        return strawberries;
    }

    public int getLemons() {
        return lemons;
    }

    public int getPinkLemonadeExtract() {
        return pinkLemonadeExtract;
    }

    // Setter methods to set new quantities for different items
    public void setSugar(int newSugar) {
        sugar = newSugar;
    }

    public void setStrawberry(int newStrawberries) {
        strawberries = newStrawberries;
    }

    public void setLemons(int newLemons) {
        lemons = newLemons;
    }

    public static void setPinkLemonadeExtract(int newPinkLemonadeExtract) {
        pinkLemonadeExtract = newPinkLemonadeExtract;
    }
}
