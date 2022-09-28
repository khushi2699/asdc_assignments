public class ShoppingBasketTest {
    public void addItemsToBasketTest(){
        Items item = new Items();
        item.setItemName("Milk");
        item.setUnitPrice(9.95);
        item.setQuantity(2);

        Items item1 = new Items();
        item1.setItemName("Wheat Bread");
        item1.setUnitPrice(5.40);
        item1.setQuantity(2);

        ShoppingBasket shopbasket = new ShoppingBasket();
        shopbasket.addItemToBasket(item);
        shopbasket.addItemToBasket(item1);

        if(shopbasket.getItems().length == 2){
            System.out.println("Items add to basket test passed!");
        }
    }

    public void getCalculateTotalPriceTest(){
        Items item = new Items();
        item.setItemName("Milk");
        item.setUnitPrice(9.95);
        item.setQuantity(2);

        Items item1 = new Items();
        item1.setItemName("Wheat Bread");
        item1.setUnitPrice(5.40);
        item1.setQuantity(2);

        ShoppingBasket shopbasket = new ShoppingBasket();
        shopbasket.addItemToBasket(item);
        shopbasket.addItemToBasket(item1);

        double totalPrice = shopbasket.calculateTotalPrice();
        if(totalPrice == 30.7)
            System.out.println("Calculate Total Price test passed!");
    }
}
