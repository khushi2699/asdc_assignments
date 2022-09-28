public class Items {
    private String itemName;
    private double totalPrice;
    private int quantity;
    private double unitPrice;

    public Items(){

    }

    public Items(String itemName, int quantity, double unitPrice)
    {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.totalPrice = unitPrice*quantity;
    }

    public String getItemName(){
        return itemName;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
