package Bad.DIP;

public class CORPTax {
    public void calculateTax(int annual_income){
        System.out.println("Calculating CORP Tax");
        int tax = (annual_income * 14) / 100;
        System.out.println("Tax on "+annual_income + "= " + tax);
    }

    public void calculateRebate(int annual_income){
        System.out.println("Calculating Rebate");
        int rebate = (annual_income * 2)/100;
        System.out.println("Rebate on "+annual_income + "= "+rebate);
    }
}
