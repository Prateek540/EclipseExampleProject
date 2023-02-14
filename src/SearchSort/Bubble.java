package SearchSort;

public class Bubble {
	public static void main(String args[]) {
		int[] arr = {12,34,10,45,67,8,89,76,1,38};
		int i, j, n = arr.length, t;
		boolean swapped = false;
		for(i=0;i<n-1;i++) {
			swapped = false;
			for(j=0;j<n-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					swapped = true;
				}
			}
			if(swapped == false)
				break;
		}
		System.out.println("Sorted array is ");
		for(i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}