package Bad.ISP;

public class Food {

    public static void main(String[] args) {
        Toppings toppings_pizza = new Pizza();
        toppings_pizza.addCheese();
        toppings_pizza.addOnions();
        toppings_pizza.bake();

        Toppings toppings_cake = new Cake();
        toppings_cake.bake();

        Toppings toppings_sandwich = new Sandwich();
        toppings_sandwich.addOnions();
        toppings_sandwich.addBread();
        toppings_sandwich.addCheese();
        toppings_sandwich.addOnions();
        toppings_sandwich.grill();
    }
}