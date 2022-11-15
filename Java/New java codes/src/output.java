public class output {
    public static void main(String[] args) {
        
        int x = 5;
        int k = 0;
        int y = 0;

        while(x < 7)
        {
            y = 1;
            while(y < 9)
            {
                y++;
                k = x + y;
            }
            x += y;
        }
        System.out.println("k = " + k);
    }
}

