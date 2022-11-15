// Student class 
class Student{     
    // Declaring Student class variables     
    int student_id, noOfCourses;     
    String name;     
    String[] courses;     
    int[] course_levels;    

    // Student constructor to initialize the variables     
    Student(int student_id, String name, int noOfCourses, String[] courses, int[] course_levels){         
        this.student_id=student_id;         
        this.name=name;         
        this.courses=new 
        String[noOfCourses];         
        this.course_levels=new 
        int[noOfCourses];         
        
        for(int i=0;i<noOfCourses;i++){             
            this.courses[i]=courses[i];             
            this.course_levels[i]=course_levels[i];         
        }         
        
        this.noOfCourses=noOfCourses;     
    }          
    
    // Describe method to display the details     
    public void describe(){         
        // Displaying all the details         
        System.out.println("Student "+this.student_id+": "+name+":");         
        for(int i=0;i<this.noOfCourses;i++){             
            System.out.println("\t- Registered for the "+this.courses[i]);             
            for(int j=0;j<this.course_levels[i];j++){                 
                System.out.println("\t- Completed level "+(j+1));             
            }         
        }     
    } 
}  

// Main class 
public class Main {     
    // Main method 	
    public static void main(String[] args) { 		
        // Initializing courses and course levels for 3 students 		
        String[] courses1=new String[]{"Software Engineering Bootcamp"}; 		
        int[] course_levels1=new int[]{1}; 		
        String[] courses2 = new String[]{"Web Development Bootcamp", "Software Engineering Bootcamp"}; 		
        int[] course_levels2=new int[]{3,0}; 		
        String[] courses3=new String[]{"Web Development Bootcamp", "Software Engineering Bootcamp"}; 		
        int[] course_levels3=new int[]{3,1}; 		
        // Creating 3 student objects 		
        Student obj1=new Student(1, "Susan Smith", courses1.length, courses1, course_levels1); 		
        Student obj2=new Student(2, "Michael Jackson", courses2.length, courses2, course_levels2); 		
        Student obj3=new Student(3, "Saoirse Ronan", courses3.length, courses3, course_levels3); 		
        // Calling describe method for each Student object 		
        obj1.describe(); 		
        obj2.describe(); 		
        obj3.describe(); 	
    } 
}

