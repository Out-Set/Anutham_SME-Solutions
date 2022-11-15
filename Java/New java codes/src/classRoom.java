class Classroom {          
    private int roomNum;     
    private int capacity;          
    public static int classroomCount=0; 

    // method: Classroom(int roomNumArg, int capacityArg)
    public Classroom(int roomNumArg, int capacityArg){         
        roomNum = roomNumArg;         
        capacity = capacityArg;         
        classroomCount++;     
    }     

    // method: getRoomNum()
    public int getRoomNum(){         
        return this.roomNum;     
    }     

    // method: setRoomNum(int newRoomNum)
    public void setRoomNum(int newRoomNum){         
        this.roomNum = newRoomNum;     
    }    
    
    // method: getCapacity()
    public int getCapacity(){         
        return this.capacity;     
    }     

    // method: setCapacity(int capacityArg)
    public void setCapacity(int capacityArg){         
        this.capacity = capacityArg;     
    }     

    // method: getClassroomCount()
    public static int getClassroomCount(){         
        return classroomCount;     
    } 
}

public class classRoom {
    public static void main(String[] args) {
        int classRoom[] = new int[10];

        Classroom cr = new Classroom(1, 23);
        cr.setRoomNum(1);
        cr.setCapacity(129);

        System.out.println("Printing out Classromm Info-----");
        System.out.println("Classroom "+cr.getRoomNum()+" ");
    }
}
