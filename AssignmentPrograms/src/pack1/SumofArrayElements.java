package pack1;

public class SumofArrayElements {

	public static void main(String[] args) {
		int [] array= {5,10,15,20,25};
		
		int sum=0;
		
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		
		System.out.println("Sum of array elements: "+sum);
}
}
  