public class DistPass {	
	static final int MAX_CHAR = 26;
	
	// finds the factorial of n.
	static int factorial(int n)
	{
		int fact = 1;
		for (int i = 2; i <= n; i++)
			fact = fact * i;
		return fact;
	}
	
	// It will count of distinct permutations of str.
	static int countDistPer(String str)
	{
		int length = str.length();
	
		int[] freq = new int[MAX_CHAR];
	
		// getting the frequency of all the lower case alphabet and storing them in array of integer.
		for (int i = 0; i < length; i++)
			if (str.charAt(i) >= 'a')
				freq[str.charAt(i) - 'a']++;
	
		// getting the factorial of number of appearances and multiplying them since they are repeating alphabets.
		int fact = 1;
		for (int i = 0; i < MAX_CHAR; i++)
			fact = fact * factorial(freq[i]);
	
		// getting the factorial of size of string and dividing it by factorial found after multiplying.
		return factorial(length) / fact;
	}
	
	// Driver code
	public static void main(String args[])
	{
		String str = "eelrstt";
		System.out.println("Number of unique passwords are: "+countDistPer(str));
	}
}

