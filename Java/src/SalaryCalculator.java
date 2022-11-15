import java.util.ArrayList; 
import java.util.List; 
import java.util.Scanner; 
public class SalaryCalculator {   
    public static void main(String args[]) {                
        // Scanner to read input from the System.                 
        Scanner sc = new Scanner(System.in);    

        // List of Employees - Employee class is created at the bottom          
        List<Employee> employees = new ArrayList<Employee>();   

        int i = 1; 

        // 3 Employee objects are added                 
        employees.add(new Employee());          
        employees.add(new Employee());          
        employees.add(new Employee());          
        for (Employee e : employees) {                  
            System.out.print("Enter the hourly rate: ");                     
            e.hourlyRate = sc.nextDouble();                  
            System.out.print("Enter hours worked ");                        
            e.hourWorked = sc.nextInt();                   
            System.out.println("Pay for employee "+i+" is $" + e.calculateSalary());   
            System.out.println();   
            i++;        
        }  
        
        sc.close();
    } 
} 

class Employee {    
    double hourlyRate;      
    int hourWorked;         
    double salary;  
    /**      
        The company pays straight time for the first 40 hours worked by each employee         
        and time and a half for all hours worked in excess of 40      
    **/     

    public double calculateSalary() {               
        if (this.hourWorked <= 40) {                         
            return this.hourWorked * this.hourlyRate;               
        } 
        else {                        
            return ((40 * this.hourlyRate)+((hourWorked-40) * (this.hourlyRate * 1.5)));           
        }       
    }
} 



