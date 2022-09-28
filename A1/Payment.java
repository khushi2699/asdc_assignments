import java.util.InputMismatchException;
import java.util.Scanner;

public class Payment {
    Scanner sc = new Scanner(System.in);

    public static void clearScreen() {

        System.out.print("\033[H\033[2J");

        System.out.flush();

    }
    public void proceedPayment(double totalPrice){
        long card_number = 0;
        int expiry = 0;
        int security_code = 0;
        clearScreen();
        System.out.println("Make a payment of $"+totalPrice);

        System.out.println("Enter your credit/debit card details (16 digit number)");
        System.out.println("Enter card number: ");
        int status = 0;
        while(status == 0){
            try{
                card_number = sc.nextLong();
                status = validateCardNumber(card_number);
                if (status == 0){
                    System.out.println("Invalid card number");
                    System.out.println("Please enter valid credit/debit number");
                    sc.nextLine();
                }
                else {
                    sc.nextLine();
                    break;
                }

            } catch(InputMismatchException ex){
                System.out.println("Incorrect input format");
                System.out.println("Please enter valid credit/debit number");
                sc.nextLine();
            }

        }

        System.out.println("Enter card holder name: ");
        String card_holder_name = sc.nextLine();

        System.out.println("Enter expiry(4 digit without '/'): ");
        int expstatus = 0;
        while(expstatus == 0){
            try {
                expiry = sc.nextInt();
                expstatus = validateExpiry(expiry);
                if (expstatus == 0){
                    System.out.println("Invalid card expiry");
                    System.out.println("Please enter valid card expiry");
                    sc.nextLine();
                }
                else {
                    sc.nextLine();
                    break;
                }
            }
            catch(InputMismatchException ex) {
                System.out.println("Incorrect input format");
                System.out.println("Please enter card expiry date");
                sc.nextLine();
            }
        }

        System.out.println("Enter security code (3 digit): ");
        int csvstatus = 0;
        while(csvstatus == 0){
            try {
                security_code = sc.nextInt();
                csvstatus = validatecsv(security_code);
                if (csvstatus == 0){
                    System.out.println("Invalid security code");
                    System.out.println("Please enter valid security code");
                    sc.nextLine();
                }
                else {
                    sc.nextLine();
                    break;
                }
            }
            catch(InputMismatchException ex) {
                System.out.println("Incorrect input format");
                System.out.println("Please enter valid security code");
                sc.nextLine();
            }
        }

        printCardDetails(card_number,card_holder_name,expiry,security_code);

    }

    public int validateCardNumber(long number){
        int length = String.valueOf(number).length();
        if(length != 16){
            return 0;
        }
        else {
            return 1;
        }
    }

    public int validateExpiry(int expiry){
        int length = String.valueOf(expiry).length();
        if(length != 4){
            return 0;
        }
        else {
            return 1;
        }
    }

    public int validatecsv(int csv){
        int length = String.valueOf(csv).length();
        if(length != 3){
            return 0;
        }
        else {
            return 1;
        }
    }

    public void printCardDetails(long card_number, String card_holder_name, int expiry, int security_code){
        System.out.println(
                "--------------------------------------------------------------"
        );
        System.out.println("Here are your card details");
        System.out.println(
                "--------------------------------------------------------------"
        );
        System.out.println("Card Number: "+card_number);
        System.out.println("Card Holdername: "+card_holder_name);
        System.out.println("Expiry date: "+expiry);
        System.out.println("Security code: "+security_code);
        System.out.println(
                "--------------------------------------------------------------"
        );
        boolean okStatus = true;
        String Ok;
        while(okStatus){
            System.out.println("Please write 'OK' to place the payment");
            Ok = sc.nextLine();
            if(Ok.equalsIgnoreCase(
                    "Ok"
            )){
                System.out.println("Congratulation!! Your order has been placed.");
                System.out.println("Thank you for shopping with us!");
                okStatus = false;
            } else {
                continue;
            }
        }
    }
}
