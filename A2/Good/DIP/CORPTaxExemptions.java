package Good.DIP;

public class CORPTaxExemptions implements TaxExemptions{

    public final Taxes taxes;
    int annual_income;

    public CORPTaxExemptions(Taxes taxes, int annual_income) {
        this.taxes = taxes;
        this.annual_income = annual_income;
    }

    @Override
    public void check() {
        if(annual_income < 500)
        {
            System.out.println("Tax is exempted");
        }
        else {
            taxes.calculateTax();
            taxes.calculateRebate();
        }
    }
}
