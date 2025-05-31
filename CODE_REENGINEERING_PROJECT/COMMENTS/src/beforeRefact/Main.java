package beforeRefact;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommentedCode code = new CommentedCode();
        // Calculate the sum of 5 and 7
        int result = code.calculateSum(5, 7);
        // Print the result
        System.out.println("Sum: " + result);
        // Check if 6 is even
        boolean isEven = code.isEven(6);
        // Print the result
        System.out.println("Is 6 even? " + isEven);
	}

}
