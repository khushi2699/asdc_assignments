package Good.ISP;

import Good.ISP.Bake;

public class Cake implements Bake {
    @Override
    public void bake() {
        System.out.println("Cake is baking");
    }
}
