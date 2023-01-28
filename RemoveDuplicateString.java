package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {
	
		String text="We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> text1=new LinkedHashSet<String>();
		for (String dup : split) {
			text1.add(dup);
			
		}
		System.out.println(text1);

	}

}
