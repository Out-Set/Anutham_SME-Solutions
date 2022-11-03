#include<iostream> 
using namespace std;  
class Employee {     
    //output name and salary with salary in the format Rxxx.xx     
    friend ostream& operator << (ostream& outs, const Employee & the_emp)     
    {         
        outs<<the_emp.name<<"  R"<<the_emp.salary;         
        return outs;     
        }      
    public:          
    Employee(string n, double sal);                       
    ~Employee();              
    void setSalary(double sal);                
    string getName()const;                     
    void raiseSalary(double percent); 
    // raises an employee’s 
    //salary with the percentage specified by the argument percent      
    private:         
    string name;         
    double salary;     
};  
    
//Implementing functions of class Employee 
Employee::Employee(string n, double sal) {     
    name = n;     
    salary = sal; 
}      
void Employee::setSalary(double sal) {     
    salary = sal; 
}      
string Employee::getName()const {     
    return name; 
}      

void Employee::raiseSalary(double percent) {     
    salary = salary + (percent*salary)/100; 
}  
int main() 
{     
    //Use the overloaded constructor to instantiate an object newEmployee of the class Employee      
    //with the name “Mpho Malebane” and a salary of R123 000.          
    Employee newEmployee("Mpho Malebane", 123000);          
    //Write a statement to check whether the object newEmployee is Mpho Malebane,      
    //and if so, raise his salary with 10%.     
    if(newEmployee.getName() == "Mpho Malebane")     {         
        newEmployee.raiseSalary(10);     
    }          
    //Use the overloaded stream insertion operator      
    //to display the name and salary of the newEmployee on the screen.     
    cout<<newEmployee;          
    return 0; 
} 
 