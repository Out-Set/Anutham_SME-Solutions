public class SwitchCase {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        switch(x+y) {
            case 6: y = 0;
            case 7: y = 1;
                break;
            default: y +=1;
        }

        System.out.println("The value of y will be: "+y);
    }
}

