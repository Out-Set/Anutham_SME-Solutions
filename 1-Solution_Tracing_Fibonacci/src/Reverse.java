
public class Reverse {
    public static void main(String[] args) {
        System.out.println(isExactReverse("ba", "a"));
        System.out.println(isExactReverse("desserts", "stressed"));
        System.out.println(isExactReverse("apple", "apple"));
        System.out.println(isExactReverse("regal", "lager"));
        System.out.println(isExactReverse("war","raw"));
        System.out.println(isExactReverse("pal","slap"));
    }
    
    public static boolean isExactReverse(String x, String y){
        if(x.length() != y.length()){
            return false;
        }
    
        int count = 0;
        int temp = x.length() - 1;
        boolean result = false;
    
        for(int i=0; i<y.length(); i++){
            if(x.charAt(temp) == y.charAt(i)){
                count++;
            }
            temp--;
        }
        if(count == y.length()){
            result = true;
        }
        return result;
    }

}