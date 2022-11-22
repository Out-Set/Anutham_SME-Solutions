public class pattern2 {
    public static void main(String args[]){
        int n = 6;  // Number of rows.

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i==j){
                    System.out.print("0");
                }
                else{
                    System.out.print("1 ");
                }
            
            }

            for(int j=i; j<=n; j++){
                System.out.print("-1");
            } 
            System.out.println();

        }
    }
}

