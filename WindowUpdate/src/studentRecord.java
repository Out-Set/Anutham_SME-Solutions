import java.util.Scanner;

public class studentRecord {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        // Student s2 = new Student();

        s1.get();
        // s2.get();

        s1.displayRecord();
        // s2.displayRecord();
        
    }
}

class Student{
    int sid;
    String name;
    String grade;

    public void set(int sid, String name, String grade){
        this.sid = sid;
        this.name = name;
        this.grade = grade;
    }
    
    public void get(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter grade: ");
        String grade = sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter student id: ");
        int id = sc.nextInt();
        
        set(id, name, grade);

        sc.close();
    }

    public void displayRecord(){
        System.out.println("The SID is: "+this.sid);
        System.out.println("The name is: "+this.name);
        System.out.println("The grade is: "+this.grade);
    }
}


