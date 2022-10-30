package Good.ISP;

public class Sandwich implements Cheese_Toppings, Peri_Toppings, Bread_Toppings, Onions_Toppings, Grill {
    @Override
    public void addCheese() {
        System.out.println("Cheese used in Sandwich");
    }

    @Override
    public void addPeriPeri() {
        System.out.println("Peri-Peri ketchup used in Sandwich");
    }

    @Override
    public void addBread() {
        System.out.println("Bread used in Sandwich");
    }

    @Override
    public void addOnions() {
        System.out.println("Onions used in Sandwich");
    }

    @Override
    public void grill() {
        System.out.println("Sandwich is grilled");
    }
}
