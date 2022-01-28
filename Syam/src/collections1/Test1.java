package collections1;

import java.util.Arrays;
import java.util.Collections;

public class Test1 {
	public static void main(String[] args) {

		String[] arr = { "syam", "kumar", "Syam", "kumar", "chirala" };
		/*
		 * System.out.println(arr); for(int i=0; i<arr.length;i++) {
		 * System.out.println(arr[i]); }
		 
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));*/
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}
}