package Arrays;

public class QuickSort {//T --> O(N2) S --> O(N)
	public static void main(String args[]) {
		int[] arr = {23,12,34,57,24,89,11,6,57,65};
		int i = 0, l = arr.length;
		System.out.println("Array is ");
		display(arr);
		quick(arr, i, l-1);
		System.out.println("Sorted Array is ");
		display(arr);
	}
	public static void quick(int[] arr, int low, int high) {
		if(low<high) {
			int location = part(arr, low, high);
			quick(arr, low, location - 1);
			quick(arr, location + 1, high);
		}
	}
	public static int part(int[] arr, int low, int high) {
			int i = low;
			int j = high;
			int pivot = arr[low];
			int t;
			while(i<j) {
				while(arr[i]<=pivot&&i<high)
					i++;
				while(arr[j]>pivot&&j>low)
					j--;
				if(i<j) {
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
			t = arr[low];
			arr[low] = arr[j];
			arr[j] = t;
			return j;
	}
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
