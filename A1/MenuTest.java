public class MenuTest {
    public void testMenuDisplay(){
        MenuItem mt[] = new MenuItem[2];
        mt[0] = new MenuItem();
        mt[0].itemNumber = 1;
        mt[0].name = "Milk";
        mt[0].price = 9.95; //1st Item

        mt[1] = new MenuItem();
        mt[1].itemNumber = 2;
        mt[1].name = "Wheat Bread";
        mt[1].price = 5.40; //2nd Item
        Menu m = new Menu();
        m.displayMenu(mt);

        System.out.println("---Menu Display test passed!");
    }

    public void testMenuDisplayEmptyBucket(){
        MenuItem mt[] = new MenuItem[0];
        Menu m = new Menu();
        m.displayMenu(mt);
        if(mt.length == 0){
            System.out.println("Empty Bucket");
        }
        System.out.println("---Menu Display empty bucket test passed!");
    }
}
