package Bad.DIP;

public class TaxExemptionGST {

    public GSTTax gstTax;

    public int annual_income;

    public TaxExemptionGST(GSTTax gstTax, int annual_income){
        this.gstTax = gstTax;
        this.annual_income = annual_income;
    }
    public void check(){
        if(annual_income < 500){
            System.out.println("Tax is exempted!");
        }
        else {
            gstTax.calculateTax(annual_income);
            gstTax.calculateRebate(annual_income);
        }
    }
}
