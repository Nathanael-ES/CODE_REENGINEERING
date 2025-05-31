package afterRefact;

public class RefactoredMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StringUtilsRefactored abc = new StringUtilsRefactored();
	        System.out.println("Reverse: " + abc.reverse("Hello"));
	        System.out.println("To Upper Case: " + abc.toUpperCase("hello"));
	        System.out.println("To Lower Case: " + abc.toLowerCase("HELLO"));
	}

}
