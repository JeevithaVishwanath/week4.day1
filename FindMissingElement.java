package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindMissingElement {

	public static void main(String[] args) {
		 
		int[] arr = {1,2,3,4,7,6,8};
		 
		Set<Integer> arr1=new TreeSet<Integer>();
		for (Integer output : arr) {
			
			arr1.add(output);
			
		}
		
		Set<Integer> arr2=new LinkedHashSet<Integer>();
		for (int i = 1; i < arr.length; i++) {
			if(!arr1.contains(i)) {
				arr2.add(i);
			}
			
		}System.out.println(arr2);

	}

}
