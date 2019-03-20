public class Array{

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 4, 56, 34, 675, 3, 0};

		int minElem = arr[0]; 

		System.out.println("Determine min and max element: \n");

		for (i=0, i < arr.length; i++) {

			if (arr[i] > minElem) {

				minElem = arr[i];
			}
		}
	System.out.println("Minimum element of array is " + minElem);

	int maxElem = arr[0];

	for(i=0, i < arr.lengt; i++) {

		if(arr[i] <maxElem) {

			maxElem = arr[i];
		}
	} 

System.out.println("Maximum element of array is " + maxElem);	

	}
}