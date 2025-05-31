package beforeRefact;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ShoppingCartItem item = new ShoppingCartItem("Product 1", 50.0,"1234234", "Cankaya", "Ankara", "12345");

        System.out.println("Item: " + item.getItemName());
        System.out.println("Price: $" + item.getPrice());
        System.out.println("Shipping Address: " + item.getShippingAddress());
        System.out.println("Shipping City: " + item.getShippingCity());
        System.out.println("Shipping State: " + item.getShippingState());
        System.out.println("Shipping Zip Code: " + item.getShippingZipCode());

	}

}
