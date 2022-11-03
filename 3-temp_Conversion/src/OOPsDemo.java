public class OOPsDemo {
    public static void main(String[] args) {
        
        // Creating object of Employee1 class
        Employee1 emp1 = new Employee1();
        emp1.set("John", 254);
        emp1.get();

        // Creating object of Employee2 class
        Employee2 emp2 = new Employee2();
        emp2.set("Captain", 254);
        emp2.get();
    }
}

class App {
    String name;
    int salary;

    void set(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    void get(){
        System.out.print("Name: "+ this.name+"\n");
        System.out.print("Salary: "+ this.salary+"\n\n");
    }
}

// class Employee1 is inheriting the class App
class Employee1 extends App {

    // Through polymorphism we can change the behaviour of super class method()
    void set(String name, int salary){
        this.name = name;

        //modified salary, initial salary is multiplied with 10.
        this.salary = salary*10;
    }
}

// // class Employee2 is inheriting the class Employee1
class Employee2 extends Employee1 {

    void set(String name, int salary){
        this.name = name;

        // again modified the salary, here salary of Employee1 class is devided by 10.
        this.salary = salary/10;
    }
}


