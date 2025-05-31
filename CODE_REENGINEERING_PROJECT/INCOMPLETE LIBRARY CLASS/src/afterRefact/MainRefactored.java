package afterRefact;

public class MainRefactored {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();

        Operation addition = new Addition();
        int resultAddition = calculator.calculate(addition, 10, 5);
        System.out.println("Addition result: " + resultAddition);

        Operation subtraction = new Subtraction();
        int resultSubtraction = calculator.calculate(subtraction, 10, 5);
        System.out.println("Subtraction result: " + resultSubtraction);
	}

}
