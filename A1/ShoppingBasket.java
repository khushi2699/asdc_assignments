public class ShoppingBasket {
    private Items[] basket;
    private double totalPrice;
    int count = 0;

    public ShoppingBasket(){
        basket = new Items[1];
    }

    public ShoppingBasket(int cartSize){
        basket = new Items[cartSize];
    }

    public Items[] getItems(){
        return basket;
    }
    public void addItemToBasket(Items item){
        if (basket.length == count) {

            Items newBasket[] = new Items[count+1];

            for (int i = 0; i < count; i++) {
                newBasket[i] = basket[i];
            }

            basket = newBasket;
        }
        basket[count++] = item;
    }

    public double calculateTotalPrice(){
        for(int i = 0 ; i < basket.length; i++){
            totalPrice += basket[i].getUnitPrice()*basket[i].getQuantity();
        }
        return totalPrice;
    }
}
