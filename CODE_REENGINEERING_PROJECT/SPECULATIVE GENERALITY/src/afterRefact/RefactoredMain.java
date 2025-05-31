package afterRefact;

public class RefactoredMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String mergedString = merge("Binu", "sian");
	        System.out.println("Merged string: " + mergedString);
	    }

	    
	
	    public static String merge(String first, String second) {
	        return first + second;
	    }
	}

