package afterRefact;


public class RefactoredMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        CommentedCodeRefactored ImprovedCode = new CommentedCodeRefactored();
         int result = ImprovedCode.calculateSum(5, 7);
        System.out.println("Sum: " + result);
         boolean isEven = ImprovedCode.isEven(6);
        System.out.println("Is 6 even? " + isEven);

	}

}

