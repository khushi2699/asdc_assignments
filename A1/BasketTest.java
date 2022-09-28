public class BasketTest {
    public void testRemoveItem(){
        System.out.println();
        System.out.println("Start of Remove Item test");
        ShoppingBasket basket = new ShoppingBasket();
        Items item = new Items();
        item.setItemName("Milk");
        item.setUnitPrice(9.95);
        item.setQuantity(2);
        basket.addItemToBasket(item);

        Items item1 = new Items();
        item1.setItemName("Wheat Bread");
        item1.setUnitPrice(5.40);
        item1.setQuantity(2);
        basket.addItemToBasket(item1);

        int itemToRemove = 1;

        Basket bas = new Basket();
        bas.removeItem(basket, itemToRemove);
        System.out.println("---Remove Item test passed");
        System.out.println();
    }

    public void testRemoveItemBadInput(){
        System.out.println();
        ShoppingBasket basket = new ShoppingBasket();
        Items item = new Items();
        item.setItemName("Milk");
        item.setUnitPrice(9.95);
        item.setQuantity(2);
        basket.addItemToBasket(item);

        Items item1 = new Items();
        item1.setItemName("Wheat Bread");
        item1.setUnitPrice(5.40);
        item1.setQuantity(2);
        basket.addItemToBasket(item1);

        int itemToRemove = 0;

        Basket bas = new Basket();
        bas.removeItem(basket, itemToRemove);
        System.out.println("---Remove Item test Bad Input passed");
        System.out.println();
    }

    public void testRemoveEmptyBasket(){
        System.out.println();
        ShoppingBasket basket = new ShoppingBasket();
        Basket bas = new Basket();
        int itemToRemove = 0;
        if(basket.getItems().length - 1 == 0){
            System.out.println("Basket is empty");
        }
        bas.removeItem(basket, itemToRemove);
        System.out.println("---Remove Item with basket empty test passed");
    }

    public void showBasketTest(){
        ShoppingBasket basket = new ShoppingBasket();

        Items item = new Items();
        item.setItemName("Milk");
        item.setUnitPrice(9.95);
        item.setQuantity(2);
        basket.addItemToBasket(item);

        Items item1 = new Items();
        item1.setItemName("Wheat Bread");
        item1.setUnitPrice(5.40);
        item1.setQuantity(2);
        basket.addItemToBasket(item1);

        Basket bas = new Basket();
        bas.showBasket(basket, false);

        System.out.println("---Show Basket test passed");
    }

    public void showBasketTestEmptyBasket(){
        ShoppingBasket basket = new ShoppingBasket();
        Basket bas = new Basket();
        if(basket.getItems().length - 1 == 0) {
            System.out.println("Basket is empty");
        }else{
            bas.showBasket(basket, false);
        }

        System.out.println("---Show Basket Empty basket test passed");
    }
}
