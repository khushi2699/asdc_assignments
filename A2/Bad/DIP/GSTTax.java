package Bad.DIP;

public class GSTTax {

    public void calculateTax(int annual_income){
        System.out.println("Calculating GST Tax");
        int tax = (annual_income * 15) / 100;
        System.out.println("Tax on "+annual_income + "= " + tax);
    }

    public void calculateRebate(int annual_income){
        System.out.println("Calculating Rebate");
        double rebate = (annual_income * 1.8)/100;
        System.out.println("Rebate on "+annual_income + "= "+rebate);
    }
}
