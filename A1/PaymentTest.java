public class PaymentTest {
    public void validateCardNumberUnderRangeTest(){
        Payment p = new Payment();
        int status = p.validateCardNumber(12);
        if(status == 0){
            System.out.println("Card Number below range");
            System.out.println("Validate card number test passed!");
        }
        else{
            System.out.println("Validate card number test not passed");
        }
    }

    public void validateCardNumberAboveRangeTest(){
        Payment p = new Payment();
        String number = "121212121212121212";
        long number1 = Long.parseLong(number);
        int status = p.validateCardNumber(number1);
        if(status == 0){
            System.out.println("Card Number above range");
            System.out.println("Validate card number test passed!");
        }
    }

    public void validateCardNumberTest(){
        Payment p = new Payment();
        String number = "1212121212121212";
        long number1 = Long.parseLong(number);
        int status = p.validateCardNumber(number1);
        if(status == 1){
            System.out.println("Card Number valid");
            System.out.println("Validate card number test passed!");
        }
    }

    public void validateExpiryBelowRange(){
        Payment p = new Payment();
        int number = 111;
        int status = p.validateExpiry(number);
        if(status == 0 ){
            System.out.println("Card Expiry below range");
            System.out.println("Validate expiry test passed!");
        }
    }

    public void validateExpiryAboveRange(){
        Payment p = new Payment();
        int number = 11111;
        int status = p.validateExpiry(number);
        if(status == 0){
            System.out.println("Card Expiry above range");
            System.out.println("Validate expiry test passed!");
        }
    }

    public void validateCSVBelowRangeTest(){
        Payment p = new Payment();
        int number = 1;
        int status = p.validatecsv(number);
        if(status == 0){
            System.out.println("Security code below range");
            System.out.println("Security code test passed!");
        }
    }

    public void validateCSVAboveRangeTest(){
        Payment p = new Payment();
        int number = 1111;
        int status = p.validateExpiry(number);
        if(status == 0){
            System.out.println("Security code above range");
            System.out.println("Security code test passed!");
        }
    }

    public void validateCSVTest(){
        Payment p = new Payment();
        int number = 111;
        int status = p.validatecsv(number);
        if(status == 1){
            System.out.println("Security code valid");
            System.out.println("Security code test passed!");
        }
    }

    public void validateExpiryTest(){
        Payment p = new Payment();
        int number = 1111;
        int status = p.validateExpiry(number);
        if(status == 1){
            System.out.println("Card Expiry above range");
            System.out.println("Validate expiry test passed!");
        }
    }
}
