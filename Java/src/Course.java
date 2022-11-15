class Course {
    public String name, instructor;
    public int number;    
    public int students[] = new int[5];

    Course() {
    
        name = "unknown";    
        number = -1;    
        instructor = "unknown";
    }
    
    public int getNumberOfStudents() {
        return students.length;
    }
    
    public void printStudentIDs() {

        if (students.length == 0) {
            System.out.println("No Students\n");
            return;
    
        }
    
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + " ");
        }
    
        System.out.println();
    }
    
    public void addStudent(int id) {

        int temp[] = students.clone();
        students = new int[temp.length + 1];
        students[temp.length] = id;
    
        for (int i = 0; i < temp.length; i++) {
            students[i] = temp[i];    
        }
    
    }
    
    public boolean removeStudent(int id) {
    
        int pos = -1;
    
        for (int i = 0; i < students.length; i++) {
            if (students[i] == id) {
                pos = i;
            } 
        }
    
        if (pos == -1) {
            return false;
    
        } 
        else {
            int temp[] = new int[students.length - 1];
            for (int i = 0; i < students.length; i++) {
                if (i < pos) {
                    temp[i] = students[i];
                } 
                else if (i > pos) {
                    temp[i - 1] = students[i];
                }    
            }
    
            students = temp.clone();
    
            return true;    
        }    
    }    
}
    
    

