import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainScreen {
    Scanner sc = new Scanner(System.in);

    public static void clearScreen() {

        System.out.print("\033[H\033[2J");

        System.out.flush();

    }

    public boolean mainScreen(UserLoginInterface.AuthenticationResult result, User user){
        clearScreen();

//        System.out.println(result);
        System.out.println("Hello " + user.getUserName() + "!!");
        Menu m = new Menu();
        MenuItem[] menuItem = new MenuItem[10];
        menuItem = m.menuDetails();

        System.out.println("Please make your selection to add item to your cart");
        String cont = "Y";
        ShoppingBasket basket = new ShoppingBasket();
        double totalPrice = 0;


        while(cont.equalsIgnoreCase("Y")) {
            int choice = 0 , quantity = 0;
            boolean isProduct = true;
            boolean isQuantity = true;
            while(isProduct){
                System.out.println("Please enter the number to select any product");
                try {
                    choice = sc.nextInt(); // it will accept only int
                    sc.nextLine();

                    if(choice < 1 || choice > 10){
                        System.out.println("Please add value in range");
                        continue;
                    }
                    isProduct = false;
                }
                catch (InputMismatchException ex){
                    System.out.println("Incorrect input format!!");
                    sc.nextLine();
                }
            }

            while(isQuantity) {
                System.out.println("Please enter the quantity");
                try{
                    quantity = sc.nextInt();
                    sc.nextLine();

                    if(quantity < 1){
                        System.out.println("Please add value greater than 0");
                        continue;
                    }

                    isQuantity = false;
                }
                catch (InputMismatchException ex){
                    System.out.println("Incorrect input!!");
                    sc.nextLine();
                }
            }
            Items item = new Items(menuItem[choice-1].name , quantity, menuItem[choice-1].price);
            basket.addItemToBasket(item); // adding things to the cart

            System.out.println("Do you want to add another item?");
            System.out.println("Press Y to continue and N to view your basket");
            cont = sc.nextLine();
            if (cont.equalsIgnoreCase("Y") ) {
                continue;
            }
            else if (cont.equalsIgnoreCase("N")){

                clearScreen();
                totalPrice = basket.calculateTotalPrice();
                Basket bas = new Basket();
                clearScreen();
                bas.showBasket(basket,false); //user selects the option to view the basket
                System.out.println("------------------------------------------------------");
                System.out.println("Total Price: "+totalPrice);
                System.out.println("------------------------------------------------------");
                System.out.println("Do you want to proceed for payment? ");
                System.out.println("Press P to proceed or press R to remove items");
                boolean isProceed = true;
                String proceed,contin;
                int removeItemNumber=0;
                proceed = sc.nextLine();
                boolean isContin = true;
                while(isProceed) {
                    switch (proceed) {
                        case "P":
                        case "p":
                            Payment p = new Payment();
                            p.proceedPayment(totalPrice);
                            System.out.println("Continue Shopping ? ");
                            System.out.println("Please write 'Continue' to continue shopping or press 'exit' to logout");
                            contin = sc.nextLine();
                            contin = contin.toLowerCase();
                            isContin = true;
                            while(isContin){
                                switch(contin) {
                                    case "continue":
                                        mainScreen(result,user);
                                        isContin = false;
                                        break;
                                    case "exit":
                                        clearScreen();
                                        System.out.println("You have been logged out!");
                                        isProceed = false;
                                        isContin = false;
                                    default:
                                        while(!contin.equalsIgnoreCase("Continue") && !contin.equalsIgnoreCase("Exit")){
                                            System.out.println("Incorrect input!");
                                            System.out.println("Please write 'Continue' to continue shopping or press 'exit' to logout");
                                            contin = sc.nextLine();
                                        }

                                }
                            }
                            isProceed = false;
                            break;

                        case "R":
                        case "r":
                            boolean isRemoveValid = true;
                            while(isRemoveValid) {
                                System.out.println("Please enter the item number from your basket to remove: ");
                                try{
                                    removeItemNumber = sc.nextInt();
                                    sc.nextLine();

                                    if(removeItemNumber < 1 || removeItemNumber > basket.getItems().length){
                                        System.out.println("Please add value greater than 0 and in range");
                                        continue;
                                    }

                                    isRemoveValid = false;
                                }
                                catch (InputMismatchException ex){
                                    System.out.println("Incorrect input!!");
                                    sc.nextLine();
                                }
                            }
                            ShoppingBasket shopBas = new ShoppingBasket();
                            shopBas = bas.removeItem(basket,removeItemNumber);
                            bas.showBasket(shopBas,true);
                            isProceed = false;
                            break;
                        default:
                            while (!proceed.equalsIgnoreCase("P") && !proceed.equalsIgnoreCase("R")) {
                                System.out.println("Incorrect input!");
                                System.out.println("Press P to proceed or press R to remove items");
                                proceed = sc.nextLine();
                            }
                    }
                }
            }
            else{
                while(!cont.equalsIgnoreCase("Y") && !cont.equalsIgnoreCase("N")){
                    System.out.println("Incorrect input!");
                    System.out.println("Press Y to continue and N to view your basket");
                    cont = sc.nextLine();
                }
                if (cont.equalsIgnoreCase("Y")) { continue; }
                else{
                    clearScreen();
                    totalPrice = basket.calculateTotalPrice();
                    Basket bas = new Basket();
                    clearScreen();
                    bas.showBasket(basket,false); //user selects the option to view the basket
                    System.out.println("------------------------------------------------------");
                    System.out.println("Total Price: "+totalPrice);
                    System.out.println("------------------------------------------------------");
                    System.out.println("Do you want to proceed for payment? ");
                    System.out.println("Press P to proceed or press R to remove items");
                    boolean isProceed = true;
                    String proceed,contin;
                    int removeItemNumber=0;
                    proceed = sc.nextLine();
                    boolean isContin = true;
                    while(isProceed) {
                        switch (proceed) {
                            case "P":
                            case "p":
                                Payment p = new Payment();
                                p.proceedPayment(totalPrice);
                                System.out.println("Continue Shopping ? ");
                                System.out.println("Please write 'Continue' to continue shopping or press 'exit' to logout");
                                contin = sc.nextLine();
                                contin = contin.toLowerCase();
                                isContin = true;
                                while(isContin){
                                    switch(contin) {
                                        case "continue":
                                            mainScreen(result,user);
                                            isContin = false;
                                            break;
                                        case "exit":
                                            clearScreen();
                                            System.out.println("You have been logged out!");
                                            isProceed = false;
                                            isContin = false;
                                        default:
                                            while(!contin.equalsIgnoreCase("Continue") && !contin.equalsIgnoreCase("Exit")){
                                                System.out.println("Incorrect input!");
                                                System.out.println("Please write 'Continue' to continue shopping or press 'exit' to logout");
                                                contin = sc.nextLine();
                                            }

                                    }
                                }
                                isProceed = false;
                                break;
                            case "R":
                            case "r":
                                boolean isRemoveValid = true;
                                while(isRemoveValid) {
                                    System.out.println("Please enter the item number from your basket to remove: ");
                                    try{
                                        removeItemNumber = sc.nextInt();
                                        sc.nextLine();

                                        if(removeItemNumber < 1 || removeItemNumber > basket.getItems().length){
                                            System.out.println("Please add value greater than 0 and in range");
                                            continue;
                                        }

                                        isRemoveValid = false;
                                    }
                                    catch (InputMismatchException ex){
                                        System.out.println("Incorrect input!!");
                                        sc.nextLine();
                                    }
                                }
                                ShoppingBasket shopBas = new ShoppingBasket();
                                shopBas = bas.removeItem(basket,removeItemNumber);
                                bas.showBasket(shopBas,true);
                                isProceed = false;
                                break;
                            default:
                                while (!proceed.equalsIgnoreCase("P") && !proceed.equalsIgnoreCase("R")) {
                                    System.out.println("Incorrect input!");
                                    System.out.println("Press P to proceed or press R to remove items");
                                    proceed = sc.nextLine();
                                }
                        }
                    }
                }
            }
        }
        return true;
    }
}