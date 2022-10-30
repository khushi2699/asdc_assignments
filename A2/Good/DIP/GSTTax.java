package Good.DIP;

public class GSTTax implements Taxes {

    public int annual_income;

    GSTTax(int annual_income){
        this.annual_income = annual_income;
    }

    @Override
    public void calculateTax() {
        System.out.println("Calculating GST Tax");
        int tax = (annual_income * 15) / 100;
        System.out.println("Tax on "+annual_income + "= " + tax);
    }

    @Override
    public void calculateRebate() {
        System.out.println("Calculating GST Rebate");
        double rebate = (annual_income * 1.8)/100;
        System.out.println("Rebate on "+annual_income + "= "+rebate);
    }
}
