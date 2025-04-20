package task2ForthPrgm;

public class Employee extends Persons {
	String employeeID;
    double salary;

    // Constructor for name and age
    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age); // Calling constructor of Persons
        this.employeeID = employeeID;
        this.salary = salary;
    }

        public void displayEmployeeInfo() {
        // Call method from parent class
        	displayPersonInfo();
        // Display employee-specific info
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: $ " + salary);
    }
}


