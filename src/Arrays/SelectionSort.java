package Arrays;

public class SelectionSort {//T --> O(N2) S --> O(1)
	public static void main(String args[]) {
		int[] arr = {45,57,12,78,11,234,1,2,67,54};
		int n = arr.length;
		int i,j,mi,t;
		System.out.println("UnSorted array is ");
		for(i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		for(i=0;i<n-1;i++) {
			mi = i;
			for(j=i+1;j<n;j++) {
				if(arr[j]<arr[mi])
					mi = j;
			}
			t = arr[mi];
			arr[mi] = arr[i];
			arr[i] = t;
		}
		System.out.println("Sorted array is ");
		for(i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}
