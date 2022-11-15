public class expression {
    public static void main(String[] args) {
        
        // when one is true another is false, it should evaluates to True
        boolean var1 = true;
        boolean var2 = false;
        boolean result1;
        
        result1 = ((var1==false) || (var2==false));
        System.out.println(result1);


        // when both are true, it should evaluates to false
        boolean var3 = true;
        boolean var4 = true;
        boolean result2;

        result2 = ((var3==false) || (var4==false));
        System.out.println(result2);


        // when both are false, it should evaluates to True
        boolean var5 = false;
        boolean var6 = false;
        boolean result3; 

        result3 = ((var5==false) || (var6==false));
        System.out.println(result3);
    }
}
