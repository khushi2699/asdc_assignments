package Bad.DIP;

import Bad.DIP.CORPTax;
import Bad.DIP.GSTTax;

public class TaxCalculator {
    public static void main(String[] args) {
        calculateYearlyTax();
    }

    public static void calculateYearlyTax(){
        GSTTax gstTax = new GSTTax();
        CORPTax corpTax = new CORPTax();
        TaxExemptionGST taxExemptiongst = new TaxExemptionGST(gstTax,1000);
        taxExemptiongst.check();
        TaxExemptionCORP taxExemptioncorp = new TaxExemptionCORP(corpTax,1000);
        taxExemptioncorp.check();
//        gstTax.calculateTax(1000);
//        gstTax.calculateRebate(1000);
//        corpTax.calculateTax(1000);
//        corpTax.calculateRebate(1000);
    }
}