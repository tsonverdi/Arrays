package day21;

import java.util.Arrays;

public class C04_ArraysQ {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		int boskap=arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			
			arr[i]= arr[i+1];
			
		}
		arr[arr.length-1]=boskap;
		System.out.println(Arrays.toString(arr));
		
	}

}
