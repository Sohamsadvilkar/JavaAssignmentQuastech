package pack1;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsinArray {

	 public static void main(String[] args) {
	        
	        int[] array = {1, 2, 3, 4, 2, 5, 6, 4, 7, 8, 1,5,3};

	        
	        findAndPrintDuplicates(array);
	    }

	    public static void findAndPrintDuplicates(int[] array) {
	        
	        Set<Integer> uniqueElements = new HashSet<>();
	        
	        Set<Integer> duplicateElements = new HashSet<>();
	        
	        
	        for (int element : array) {
	            
	            if (!uniqueElements.add(element)) {
	                duplicateElements.add(element);
	            }
	        }
	        
	        if (duplicateElements.isEmpty()) {
	            System.out.println("No duplicates found.");
	        } else {
	            System.out.println("Duplicate elements: " + duplicateElements);
	        }
	    }

}
