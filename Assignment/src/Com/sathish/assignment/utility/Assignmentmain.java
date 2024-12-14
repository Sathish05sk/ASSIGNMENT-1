package Com.sathish.assignment.utility;
import Com.sathish.assignment.employee.Manager;
import Com.sathish.assignment.employee.Developer;

public class Assignmentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
			manager.setName("sathish");
			manager.setEmployeeId(23);
			manager.setSalary(65001);
			manager.setDepartment("HR");
			
			
		Developer developer = new Developer();
			developer.setName("kumar");
			developer.setEmployeeId(21);
			developer.setSalary(65031);
			developer.setProlang("HR");
			
			System.out.println("Manager Details:");
			EmployeeUtility.printManagerDetails(manager);
			
			System.out.println("Developer Details");
			EmployeeUtility.printDeveloperDetails(developer);
	
	}

}