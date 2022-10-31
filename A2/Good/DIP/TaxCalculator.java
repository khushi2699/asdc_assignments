package Good.DIP;

public class TaxCalculator {
    public static void main(String[] args) {
        calculateYearlyTax();
    }

    public static void calculateYearlyTax(){
        Taxes gst = new GSTTax(1000);
        TaxExemptions gstExemption = new GSTTaxExemptions(gst,1000);
        gstExemption.check();
        Taxes corp = new CORPTax(1000);
        TaxExemptions corpExemption = new CORPTaxExemptions(corp,1000);
        corpExemption.check();
        /* Here TaxCalculator is the higher level class and we have used interface so it doesnt need to be dependent
        on lower level class. This makes the code more simpler.
        Acc to the DIP, higher level classes must not depend on lower level class
        Rather they should depend on abstractions.
         */
    }
}