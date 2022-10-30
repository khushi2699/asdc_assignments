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
//        gst.calculateTax();
//        gst.calculateRebate();
//        corp.calculateTax();
//        corp.calculateRebate();
    }
}