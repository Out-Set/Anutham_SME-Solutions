// Import statement, to define the BigInteger class
import java.math.BigInteger;
  
public class solution {  
    public static void main(String[] args)
    {
        // Creating 2 BigInteger objects
        BigInteger b1, b2;
  
        b1 = new BigInteger("3214553537");
        b2 = new BigInteger("76137217351");
  
        // Converting BigInteger to LongValue
        long longValueOfb1 = b1.longValue();
        long longValueOfb2 = b2.longValue();
  
        // Printing longValue
        System.out.println("longValue of " + b1 + " : " + longValueOfb1);
        System.out.println("longValue of " + b2 + " : " + longValueOfb2);
    }
}

