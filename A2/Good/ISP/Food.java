package Good.ISP;

import Bad.ISP.Cake;
import Bad.ISP.Pizza;
import Bad.ISP.Sandwich;

public class Food {

    public static void main(String[] args) {
        Pizza toppings_pizza = new Pizza();
        toppings_pizza.addCheese();
        toppings_pizza.addOnions();
        toppings_pizza.bake();

        Cake toppings_cake = new Cake();
        toppings_cake.bake();

        Sandwich toppings_sandwich = new Sandwich();
        toppings_sandwich.addOnions();
        toppings_sandwich.addBread();
        toppings_sandwich.addCheese();
        toppings_sandwich.addOnions();
        toppings_sandwich.grill();
    }
}