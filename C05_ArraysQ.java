package day21;

public class C05_ArraysQ {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8};
		
		int toplam= 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			toplam+=arr[i];
			
		}
		System.out.println(toplam);

	}

}
