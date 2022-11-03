public class recursiveSurprise {
    public static void main(String[] args) {
        
        
        System.out.println(Surprise.surprise(4, 8, 3));
    }
}

class Surprise {
    public static int surprise(int a, int b, int c){
        if(a == 0){
            return c;
        }
        if(a%2 == 0){
            return c + surprise(a-1, b+1, c);
        }
        return c + surprise(a-1, b, c+1);
    }
}

