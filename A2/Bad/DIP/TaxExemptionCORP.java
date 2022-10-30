package Bad.DIP;

public class TaxExemptionCORP {

    public CORPTax corpTax;

    public int annual_income;

    public TaxExemptionCORP(CORPTax corpTax, int annual_income){
        this.corpTax = corpTax;
        this.annual_income = annual_income;
    }
    public void check(){
        if(annual_income < 500){
            System.out.println("Tax is exempted!");
        }
        else {
            corpTax.calculateTax(annual_income);
            corpTax.calculateRebate(annual_income);
        }
    }
}
