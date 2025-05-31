package afterRefact;


public class MainRefactored {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryCalc context = new SalaryCalc(35, 160, 25.0, true, false);
        PersonRefactored person = new PersonRefactored();
       double salary = person.calculateSalary(context);
       System.out.println("Salary: " + salary);
	}

}
