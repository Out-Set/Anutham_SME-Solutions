// program to findout LongestCommonSubsequence
public class LongestCommonSubsequence {

// Returns length of LCS for X[0..m-1], Y[0..n-1]
	int lcs( char[] X, char[] Y, int m, int n ) {
		if (m == 0 || n == 0)
			return 0;
		if (X[m-1] == Y[n-1])
			return 1 + lcs(X, Y, m-1, n-1);
		else
			return max(lcs(X, Y, m, n-1), lcs(X, Y, m-1, n));
	}

	// helper function to get max of 2 integers
	int max(int a, int b) {
		return (a > b)? a : b;
	}

	public static void main(String[] args) {
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
		String s1 = "CALPOLYISGOOD";
		String s2 = "SCHOOLINCS";

		char[] X=s1.toCharArray();
		char[] Y=s2.toCharArray();
		int m = X.length;
		int n = Y.length;

		System.out.println("Length of LongestCommonSubsequence is:" + " " + lcs.lcs( X, Y, m, n ) );
	}
}

