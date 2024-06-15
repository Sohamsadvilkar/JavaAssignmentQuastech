package pack1;

public class LargestElementinArray {

	public static void main(String[] args) {
		int [] array = {5,2,8,3,1,9,6};
		
		int largestElement = findLargestElement(array);
		
		System.out.println("The largest element in the array is: "+ largestElement);

	}
	
	public static int findLargestElement(int[]array) {
		
		if (array == null || array.length == 0) {
			
			throw new IllegalArgumentException("Array is Empty");
		}
		
		int largest= array[0];
		
		for(int i =1; i< array.length;i++) {
			if(array[i]> largest) {
				
				largest=array[i];
			}
		}
		return largest;
	}

}
