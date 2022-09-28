public class Menu {
    public MenuItem[] menuDetails()
    {
        System.out.println("Please select the items you want to buy from the below list");

        MenuItem[] menuItem = new MenuItem[10];
        menuItem[0] = new MenuItem();
        menuItem[0].itemNumber = 1;
        menuItem[0].name = "Milk";
        menuItem[0].price = 9.95; //1st Item

        menuItem[1] = new MenuItem();
        menuItem[1].itemNumber = 2;
        menuItem[1].name = "Wheat Bread";
        menuItem[1].price = 5.40; //2nd Item

        menuItem[2] = new MenuItem();
        menuItem[2].itemNumber = 3;
        menuItem[2].name = "Tomatoes/kg ";
        menuItem[2].price = 4.45; //3rd Item

        menuItem[3] = new MenuItem();
        menuItem[3].itemNumber = 4;
        menuItem[3].name = "Cauliflower";
        menuItem[3].price = 3.35; //4th Item

        menuItem[4] = new MenuItem();
        menuItem[4].itemNumber = 5;
        menuItem[4].name = "Cheddar";
        menuItem[4].price = 5; //5th Item

        menuItem[5] = new MenuItem();
        menuItem[5].itemNumber = 6;
        menuItem[5].name = "Black Forrest";
        menuItem[5].price = 5; //6th Item

        menuItem[6] = new MenuItem();
        menuItem[6].itemNumber = 7;
        menuItem[6].name = "Apples/kg";
        menuItem[6].price = 4.5; //7th Item

        menuItem[7] = new MenuItem();
        menuItem[7].itemNumber = 8;
        menuItem[7].name = "Banana/kg";
        menuItem[7].price = 6.20; //8th Item

        menuItem[8] = new MenuItem();
        menuItem[8].itemNumber = 9;
        menuItem[8].name = "Grapes/kg";
        menuItem[8].price = 8.70; //9th Item

        menuItem[9] = new MenuItem();
        menuItem[9].itemNumber = 10;
        menuItem[9].name = "Yogurt";
        menuItem[9].price = 3.75; //10th Item

        displayMenu(menuItem);
        return menuItem;
    }

    public void displayMenu(MenuItem[] menuItem){
        int menuItemNameLength=0;

        for (MenuItem menuItem1 : menuItem) {
            if (menuItemNameLength < menuItem1.name.length()) {
                menuItemNameLength = menuItem1.name.length();
            }
        }
        System.out.println("-------------------------");
        for(int i = 0 ; i < menuItem.length ; i++){

            System.out.print(menuItem[i].itemNumber);
            System.out.print("\t");
            System.out.print(menuItem[i].name);

            for(int j=0;j<=menuItemNameLength-menuItem[i].name.length();j++)
            {
                System.out.print(" ");
            }
            System.out.print("\t");
            System.out.println(menuItem[i].price);
        }
        System.out.println("-------------------------");
    }
}
