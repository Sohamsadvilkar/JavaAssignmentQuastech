package pack1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindCommonElementsfrom2Array {

	public static void main(String[] args) {
        
        int[] array1 = {1, 2, 3, 4, 5, 6,7};
        int[] array2 = {4, 5, 6, 7, 8, 9};

        
        int[] commonElements = findCommonElements(array1, array2);

        
        System.out.println("Common elements: " + Arrays.toString(commonElements));
    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        
        Set<Integer> set1 = new HashSet<>();
        for (int element : array1) {
            set1.add(element);
        }

       
        Set<Integer> commonElementsSet = new HashSet<>();
        for (int element : array2) {
            if (set1.contains(element)) {
                commonElementsSet.add(element);
            }
        }

        
        int[] commonElements = new int[commonElementsSet.size()];
        int i = 0;
        for (int element : commonElementsSet) {
            commonElements[i++] = element;
        }

        return commonElements;
    }

}
