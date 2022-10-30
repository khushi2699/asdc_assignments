package Bad.ISP;

public class Cake implements Toppings {
    @Override
    public void addCheese() {
        //do nothing
    }

    @Override
    public void addPeriPeri() {
        //do nothing
    }

    @Override
    public void addBread() {
        //do nothing
    }

    @Override
    public void addOnions() {
        //do nothing
    }

    @Override
    public void bake() {
        System.out.println("Cake is baking");
    }

    @Override
    public void grill() {
        //do nothing
    }
}
