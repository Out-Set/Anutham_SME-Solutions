class PushZero {
	static void emptyPacketsToEnd(int arr[], int n) {

        // Count of non-zero elements
		int count = 0; 

		// Traverse the array. If element encountered is non-zero, then replace the element at index 'count' with this element
		for (int i = 0; i < n; i++)
			if (arr[i] != 0){
                // here count is incremented
				arr[count++] = arr[i]; 
            }

		// Now all non-zero elements have been shifted to front and 'count' is set as index of first 0.
		// Make all elements 0 from count to end.
		while (count < n)
			arr[count++] = 0;
	}

	// main function
	public static void main (String[] args) {
		int arr1[] = {4, 5, 0, 9, 0, 5, 0};

        int arr2[] = {6, 0, 1, 8, 0, 2};

		emptyPacketsToEnd(arr1, 7);
        emptyPacketsToEnd(arr2, 6);

		System.out.println("Array after pushing empty packets to end: ");
		for (int i=0; i<7; i++){
			System.out.print(arr1[i]+" ");
        }

        System.out.println(); //changing the line

        System.out.println("Array after pushing empty packets to end: ");
		for (int i=0; i<6; i++){
			System.out.print(arr2[i]+" ");
        }

        System.out.println(); //changing the line
	}
}

