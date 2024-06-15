package pack1;
import java.util.Arrays;
public class ArrayinAscendingOrder {

	public static void main(String[] args) {
		int [] array= {5,2,8,3,1,9,6};
		
		System.out.println("Original Array: "+Arrays.toString(array));
		
		Arrays.sort(array);
		
		System.out.println("Sorted Array: "+Arrays.toString(array));
		
		

	}

}
