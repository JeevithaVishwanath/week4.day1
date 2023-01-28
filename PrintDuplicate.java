package week4.day1;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicate {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		Set<Integer> arr1 =new HashSet<Integer>();
		
		for (Integer output : arr) {
			arr1.add(output);
			
		}
        System.out.println(arr1);
	}

}
