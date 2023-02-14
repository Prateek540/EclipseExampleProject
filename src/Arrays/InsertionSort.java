package Arrays;

public class InsertionSort {//T --> O(N2) S --> O(1)
	public static void main(String args[]) {
		int[] arr = {23,12,34,57,24,89,11,6,57,65};
		int i = 0, n = arr.length,temp,j;
		System.out.println("Array is ");
		display(arr);
		for(i=1;i<n;i++) {
			temp = arr[i];
			j = i-1;
			while(j>=0&&arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		System.out.println("Sorted Array is ");
		display(arr);
	}
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
