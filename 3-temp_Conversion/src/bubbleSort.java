class BubbleSort {
    // main function
	public static void main(String args[])
	{
        //create an int array we want to sort using bubble sort algorithm
		int intArray[] = new int[]{5,90,35,45,150,3};


        //print array before sorting using bubble sort algorithm
        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
        System.out.println();

        //sort an array using bubble sort algorithm
		bubbleSort(intArray);

        //print array after sorting using bubble sort algorithm
        System.out.println("Array After Bubble Sort");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
	}

	static void bubbleSort(int arr[]) {
        int n = arr.length;
		int i, j, temp;
		boolean swapped;
		for (i = 0; i < n - 1; i++) {
			swapped = false;
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap arr[j] and arr[j+1]
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			// IF no two elements were swapped by inner loop, then break
			if (swapped == false)
				break;
		}
	}
}

