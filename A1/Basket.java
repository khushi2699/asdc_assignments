public class Basket {
    public static void clearScreen() {

        System.out.print("\033[H\033[2J");

        System.out.flush();

    }

    static UserLoginInterface auth;

    public static void initialize() {
        auth = new LoginAPI();
    }

    public void showBasket(ShoppingBasket basket, boolean isRemove){
//       clearScreen();
       double totalPrice = 0;
        System.out.println("Your basket");
        System.out.println("------------------------------------------------------");
        System.out.print("Sr No.");
        System.out.print("\t");
        System.out.print("Item Name");
        System.out.print("\t");
        System.out.print("Qty");
        System.out.print("\t");
        System.out.print("Ut. Price");
        System.out.print("\t");
        System.out.println("Price");
        System.out.println("------------------------------------------------------");

        if(isRemove == true){
            int bucketItemsLength = 0;
            for(int i = 0 ; i < basket.getItems().length; i++)
            {
                if(bucketItemsLength < basket.getItems()[i].getItemName().length()){
                    bucketItemsLength = basket.getItems()[i].getItemName().length();
                }
            }

            if(basket.getItems().length - 1 == 0){
                initialize();
                User user = new User();
                user.setUserName("Khushi");
                user.setPassword("kshah2699");
                System.out.println("Your cart is empty!!");
                System.out.println("------------------------------------------------------");
                System.out.println("Redirecting you to menu page!");
                MainScreen mainScreen = new MainScreen();
                UserLoginInterface.AuthenticationResult result = user.login(auth);
                mainScreen.mainScreen(result,user);
            }
            else{
            for(int i = 0 ; i < basket.getItems().length-1; i++) {
                System.out.print(i + 1);
                System.out.print("\t");
                for(int j=0;j<=bucketItemsLength-basket.getItems()[i].getItemName().length();j++)
                {
                    System.out.print(" ");
                }
                System.out.print(basket.getItems()[i].getItemName());
                System.out.print("\t");
                System.out.print(basket.getItems()[i].getQuantity());
                System.out.print("\t");
                System.out.print(basket.getItems()[i].getUnitPrice());
                System.out.print("\t");
                System.out.print("        ");
                double price = basket.getItems()[i].getUnitPrice() * basket.getItems()[i].getQuantity();
                System.out.printf("%.2f",price);
                System.out.println();

                totalPrice = totalPrice + price;
            }
            System.out.println("------------------------------------------------------");
            System.out.println("Total Price: "+totalPrice);
            System.out.println("------------------------------------------------------");
            System.out.println("Proceeding to payment.......");
            Payment p = new Payment();
            p.proceedPayment(totalPrice);}
        }
        else {
            int bucketItemsLength = 0;
            for(int i = 0 ; i < basket.getItems().length; i++)
            {
                if(bucketItemsLength < basket.getItems()[i].getItemName().length()){
                    bucketItemsLength = basket.getItems()[i].getItemName().length();
                }
            }
            for(int i = 0 ; i < basket.getItems().length; i++) {
                System.out.print(i + 1);
                System.out.print("\t");
                for(int j=0;j<=bucketItemsLength-basket.getItems()[i].getItemName().length();j++)
                {
                    System.out.print(" ");
                }
                System.out.print(basket.getItems()[i].getItemName());
                System.out.print("\t");
                System.out.print(basket.getItems()[i].getQuantity());
                System.out.print("\t");
                System.out.print(basket.getItems()[i].getUnitPrice());
                System.out.print("\t");
                System.out.print("        ");
                double price = basket.getItems()[i].getUnitPrice() * basket.getItems()[i].getQuantity();
                System.out.printf("%.2f",price);
                System.out.println();

            }
        }

    }

    public ShoppingBasket removeItem(ShoppingBasket bas , int number){
        ShoppingBasket bb = new ShoppingBasket();
        if(number > 0 && number <= bas.getItems().length)
        {
            bb = bas;
            System.out.println("Removing Item no: " + number+ " -- " + bas.getItems()[number-1].getItemName());
            for(int i = 0, k=0 ; i < bas.getItems().length; i++){
                if(i == (number-1)){
                    continue;
                }
                bb.getItems()[k].setItemName(bas.getItems()[i].getItemName());
                bb.getItems()[k].setQuantity(bas.getItems()[i].getQuantity());
                bb.getItems()[k].setUnitPrice(bas.getItems()[i].getUnitPrice());
                k++;
            }
            return bb;
        }
        return null;
    }
}
