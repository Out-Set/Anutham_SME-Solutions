public class App {

    static boolean can_upgrade(int memory, double procSpeed, String currOS) {
        
        if(memory >= 1 && procSpeed >=1.0 && (currOS == "Window 7" || currOS == "Window 8")){
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws Exception {

        boolean computer1 = can_upgrade(1, 1.2, "Window 7");
        if(computer1 == true)
            System.out.println("computer1, Can upgrade");
        else
            System.out.println("computer1, Can't upgrade");

        boolean computer2 = can_upgrade(1, 1.2, "Window XP");
        if(computer2 == true)
            System.out.println("computer2, Can upgrade");
        else
            System.out.println("computer2, Can't upgrade");
    }
}





class updateWindow {
    boolean can_upgrade(int memory, double procSpeed, String currOS) {
        
        if(memory >= 1 && procSpeed >=1.0 && (currOS == "Window 7" || currOS == "Window 8")){
            return true;
        }

        return false;
    }
}