import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Set;
import java.util.Collections;

//Defining the employee class.
class Employee {

//Defining the data members.
   private String id, lastName, firstName;
   private int salary;

//Creatiing the constructor.
   public Employee(String id, String lastName, String firstName, int salary) {
       this.id = id;
       this.lastName = lastName;
       this.firstName = firstName;
       this.salary = salary;
   }

//Defining the getter methods.
   public String getId() {
       return id;
   }

   public String getLastName() {
       return lastName;
   }

   public String getFirstName() {
       return firstName;
   }

   public int getSalary() {
       return salary;
   }

//Defining the method to return the employee details.
   @Override
   public String toString() {

//Use number format and decimal format in order to format the salary to desired output.
       NumberFormat nfm = NumberFormat.getCurrencyInstance();
       String pt = ((DecimalFormat) nfm).toPattern();
       String npt = pt.replace("\u00A4", "").trim();
       NumberFormat nfm2 = new DecimalFormat(npt);
       nfm2.setMinimumFractionDigits(0);

//Return the attributes with message.
       return "ID " + id + ":" + lastName + ", " + firstName + ", salary $" + nfm2.format(salary);
   }
}


// Main Method
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Employee> employees =new ArrayList<>();
	    
	    Employee first = new Employee("12345","Baker","Tom",200000);
	    Employee second =new Employee("56789","Jones","Dan",130000);
	    Employee third =new Employee("24680","Scott","Ann",90000);
	    Employee fourth =new Employee("13579","Jones","Pat",80000);
	    Employee fifth =new Employee("11111","Scott","Bob",65000);
	    Employee sixth =new Employee("23232","Baker","Amy",100000);
	    Employee seventh =new Employee("45454","Perez","Ava",105000);
	    Employee eigth =new Employee("67765","Jones","Don",140000);
	    
	    employees.add(first);
	    employees.add(second);
	    employees.add(third);
	    employees.add(fourth);
	    employees.add(fifth);
	    employees.add(sixth);
	    employees.add(seventh);
	    employees.add(eigth);
	    
	    System.out.println("All Employees\n");
	    for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
	    
	    
	    
	    TreeMap<String,Employee> employees_order = new TreeMap<String,Employee>();
	    for (Employee employee : employees) {
			employees_order.put(employee.getId(),employee);
		}
		System.out.println("\nEmployees By Id #\n");
	    
	    Set<String> keys = employees_order.keySet();
	    List<String> keylist = new ArrayList<>();
	    for (String e : keys) 
            keylist.add(e);
        Collections.sort(keylist);
	    keylist.forEach( key -> {            
            System.out.println(employees_order.get(key));
        });
        
	}
}

