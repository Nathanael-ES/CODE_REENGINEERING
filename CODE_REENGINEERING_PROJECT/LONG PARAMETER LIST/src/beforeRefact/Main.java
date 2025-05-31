package beforeRefact;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person person = new Person();
       double salary = person.calculateSalary(35, 160, 25.0, true, false);
       System.out.println("Salary: " + salary);

	}

}
