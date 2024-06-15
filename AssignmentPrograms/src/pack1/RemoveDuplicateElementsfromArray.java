package pack1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsfromArray {

	public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 2, 5, 6, 4, 7, 8, 1};
        System.out.println("Array Before removing duplicate elements: "+Arrays.toString(array));

       
        int[] modifiedArray = removeDuplicates(array);

        
        System.out.println("Array after removing duplicate elements: " + Arrays.toString(modifiedArray));
    }

    public static int[] removeDuplicates(int[] array) {
        
        Set<Integer> set = new LinkedHashSet<>();
        
        
        for (int element : array) {
            set.add(element);
        }
        
        
        int[] result = new int[set.size()];
        int i = 0;
        for (int element : set) {
            result[i++] = element;
        }
        
        return result;
    }
}
