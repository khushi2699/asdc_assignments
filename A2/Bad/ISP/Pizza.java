package Bad.ISP;

public class Pizza implements Toppings {
    @Override
    public void addCheese() {
        System.out.println("Cheesec added");
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
        System.out.println("Onions added");
    }

    @Override
    public void bake() {
        System.out.println("Food is baked");
    }

    @Override
    public void grill() {
        //do nothing
    }
}
