package Com.sathish.assignment.utility;
import Com.sathish.assignment.employee.Developer;
import Com.sathish.assignment.employee.Employee;
import Com.sathish.assignment.employee.Manager;
public class EmployeeUtility {
	public static void printEmployeeDetails(Employee employee) {
		System.out.println("Name:" + employee.getName());
		System.out.println("ID:" + employee.getEmployeeid());
		System.out.println("Salary:" + employee.getSalary());
	}
	
	public static void printManagerDetails(Manager manager) {
		printEmployeeDetails(manager);
		System.out.println("Department:" + manager.getDepartment());
	}
	
	public static void printDeveloperDetails(Developer developer) {
		printEmployeeDetails(developer);
		System.out.println("Prog Lang:" + developer.getProlang());
	}

	public static void printDeveloperDetails(Manager manager) {
		// TODO Auto-generated method stub
		
	}
	

}
