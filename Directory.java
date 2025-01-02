
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Directory
{
	List<Employee> employees = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	// addEmployees method is used to add employees in directory
	public void addEmployees(Employee emp)
	{
		employees.add(emp);
	}
	
	// displayAllEmployees method is used to displayed all the employees present in directory
	public void displayAllEmployees() 
	{
		 if (employees.isEmpty()) 
		 {
			 System.out.println("No employees to display.");
	     }
		 else
		 {
			 employees.forEach(emp -> System.out.println(emp));			 
		 }
	}

	// updateEmployee method is used to update employee based on index position
	public void updateEmployee()
	{
		System.out.print("Enter index of employee to update: ");
        int index = sc.nextInt();
        sc.nextLine(); // Consume newline

        if (index >= 0 && index < employees.size()) {
            System.out.print("Enter new name: ");
            String name = sc.nextLine();

            System.out.print("Enter new position: ");
            String position = sc.nextLine();

            System.out.print("Enter new salary: ");
            double salary = sc.nextDouble();

            employees.set(index, new Employee(name, position, salary));
            System.out.println("Employee updated successfully.");
        } 
        else 
        {
            System.out.println("Invalid index.");
        }
	}

	// deleteEmployee method is used to delete employee based on index position
	public void deleteEmployee() 
	{
		 System.out.print("Enter index of employee to delete: ");
	        int index = sc.nextInt();

	        if (index >= 0 && index < employees.size()) 
	        {
	        	employees.remove(index);
	            System.out.println("Employee deleted successfully.");
	        } 
	        else 
	        {
	            System.out.println("Invalid index.");
	        }
	}

}
