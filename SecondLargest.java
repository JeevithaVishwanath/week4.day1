package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
     
		int[] data = {3,2,11,4,6,7};
		
		List<Integer> large =new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			
			large.add(data[i]);
			
		}
		
		Collections.sort(large);
		System.out.println(large.get(large.size()-2));
		

	}

}
