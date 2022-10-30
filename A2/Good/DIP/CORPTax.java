package Good.DIP;

public class CORPTax implements Taxes {
    
    public int annual_income;
    
    CORPTax(int annual_income){
        this.annual_income = annual_income;
    }
    @Override
    public void calculateTax() {
        System.out.println("Calculating CORP Tax");
        int tax = (annual_income * 14) / 100;
        System.out.println("Tax on "+annual_income + "= " + tax);
    }

    @Override
    public void calculateRebate() {
        System.out.println("Calculating CORP Rebate");
        int rebate = (annual_income * 2)/100;
        System.out.println("Rebate on "+annual_income + "= "+rebate);
    }
}
