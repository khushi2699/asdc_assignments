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
        /* here the Tax calculator is the higher level class which is dependent on the lower level class
        TaxExemptionGST and TaxExemptionCorp.
        Hence it is violating the Dependency Inversion Principle.
        If we want to add one more taxing method then we need to change this TaxCalculator Class
         */
    }
}