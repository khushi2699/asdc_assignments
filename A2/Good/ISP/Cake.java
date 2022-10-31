package Good.ISP;

import Good.ISP.Bake;

public class Cake implements Bake {
    /*
    Cake class only implements the interfaces of the toppings that are required by it.
     */
    @Override
    public void bake() {
        System.out.println("Cake is baking");
    }
}
