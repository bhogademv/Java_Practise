import java.util.Arrays;

public class Array_Demo {

	public static void main(String[] args) {
		int[] ar = new int[] { 1, 3, 7, 19, 26 };
		  
        // 2 has to be inserted
        int pos = Arrays.binarySearch(ar, 15);
        System.out.println("15 has to be inserted at location : " + ~pos);
        System.out.println(Arrays.toString(ar)+"\n");
        
    	int[] arr= {52,23,71,2,43,85,24};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
