package afterRefact;

public class ShoppingCartItemRefactored {
    private String itemName;
    private double price;
    private RefactoredAddress shippingAddress;

    public ShoppingCartItemRefactored(String itemName, double price, RefactoredAddress shippingAddress) {
        this.itemName = itemName;
        this.price = price;
        this.shippingAddress = shippingAddress;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public RefactoredAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(RefactoredAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}