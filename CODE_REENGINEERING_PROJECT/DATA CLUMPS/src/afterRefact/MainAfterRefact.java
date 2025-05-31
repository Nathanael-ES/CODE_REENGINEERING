package afterRefact;


public class MainAfterRefact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RefactoredAddress shippingAddress = new RefactoredAddress("1234234", "Cankaya", "Ankara", "12345");
        ShoppingCartItemRefactored item = new ShoppingCartItemRefactored("Product 1", 50.0, shippingAddress);

        System.out.println("Item: " + item.getItemName());
        System.out.println("Price: $" + item.getPrice());
        System.out.println("Shipping Address: " + item.getShippingAddress().getAddress());
        System.out.println("Shipping City: " + item.getShippingAddress().getCity());
        System.out.println("Shipping State: " + item.getShippingAddress().getState());
        System.out.println("Shipping Zip Code: " + item.getShippingAddress().getZipCode());

	}

}
