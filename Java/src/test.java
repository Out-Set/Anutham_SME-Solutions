class test {    
    public static void main(String[] args) {
    
        Course c1 = new Course();    
        c1.name = "Core-Java";    
        c1.number = 896354;    
        c1.instructor = "John";    
        int studentIds[] = { 23, 45, 56, 67, 89, 90 };    
        c1.students = studentIds;
    
        System.out.println("Course Name: " + c1.name);        
        System.out.println("Course Number: " + c1.number);    
        System.out.println("Course Instructor: " + c1.instructor);
    
        System.out.println("No of students on Course: " + c1.getNumberOfStudents());
    
        System.out.print("Student id: ");
    
        c1.printStudentIDs();    
        c1.addStudent(85);
    
        if (c1.removeStudent(89) == true) {    
            System.out.println("Removed Student");    
        } 
        else {    
            System.out.println("Student Not Found");    
        }
    
    System.out.println("Course Details after operations: ");    
    System.out.println("Course Name: " + c1.name);    
    System.out.println("Course Number: " + c1.number);    
    System.out.println("Course Instructor: " + c1.instructor);    
    System.out.println("No of students on Course: " + c1.getNumberOfStudents());    
    System.out.print("Student id: ");
    
    c1.printStudentIDs();
    
    }    
}
    
    