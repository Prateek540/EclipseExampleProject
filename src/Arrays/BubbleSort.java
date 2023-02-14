package Arrays;

public class BubbleSort {//T --> O(N2) S --> O(1)
	public static void main(String args[]) {
		int[] arr = {45,57,12,78,11,234,1,2,67,54};
		int n = arr.length;
		int i,j,t;
		boolean isSwap = false;
		System.out.println("UnSorted array is ");
		for(i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		for(i=0;i<n-1;i++) {
			isSwap = false;
			for(j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					isSwap = true;
					t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
			if(isSwap == false)
				break;
		}
		System.out.println("Sorted array is ");
		for(i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}