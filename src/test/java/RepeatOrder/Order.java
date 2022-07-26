package RepeatOrder;

public class Order {
    int price;
    boolean isVegan;
    String customerName;

    public Order(int price, boolean isVegan, String customerName) {
        this.price = price;
        this.isVegan = isVegan;
        this.customerName = customerName;
    }
    @Override
    public String toString(){
        return "Price = " + price +",is vegan? - " + isVegan + ",name = " + customerName;

    }
}
