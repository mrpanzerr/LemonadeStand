public class Inventory {
    private static int lemons;
    private static int strawberries;
    private static int sugar;
    private static int pinkLemonadeExtract;

    public static void subtractLemons(int amount) {
        if (amount > 0 && amount <= lemons) {
            lemons -= amount;
        } else {
            System.out.println("Not enough lemons in inventory.");
        }
    }

    public static void subtractStrawberries(int amount) {
        if (amount > 0 && amount <= strawberries) {
            strawberries -= amount;
        }
        else {
            System.out.println("Not enough strawberries in inventory.");
        }
    }

    public static void subtractSugar(int amount) {
        if (amount > 0 && amount <= sugar) {
            sugar -= amount;
        } else {
            System.out.println("Not enough sugar in inventory.");
        }
    }
    public static void subtractPinkLemonadeExtract(int amount) {
        if (amount > 0 && amount <= pinkLemonadeExtract) {
            pinkLemonadeExtract -= amount;
        } else {
            System.out.println("Not enough pink lemonade extract in inventory.");
        }
    }
    // Getters
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
    // Setters
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