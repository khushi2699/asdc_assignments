package Good.ISP;

import Good.ISP.Bake;
import Good.ISP.Cheese_Toppings;
import Good.ISP.Onions_Toppings;

public class Pizza implements Cheese_Toppings, Onions_Toppings, Bake {
    /*
    Pizza class only implements the interfaces of the toppings that are required by it.
     */
    @Override
    public void addCheese() {
        System.out.println("Cheese added");
    }

    @Override
    public void addOnions() {
        System.out.println("Onions added");
    }

    @Override
    public void bake() {
        System.out.println("Food is baked");
    }
}
