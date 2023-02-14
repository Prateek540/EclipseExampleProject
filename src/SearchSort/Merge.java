package SearchSort;

public class Merge {
	
	public static void main(String args[]) {
		int[] arr = {23,12,34,57,24,89,11,6,57,65};
		int i = 0, l = arr.length;
		System.out.println("Array is ");
		display(arr);
		MergeSort(arr, i, l-1);		
		System.out.println("Sorted Array is ");
		display(arr);
	}
	
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void MergeSort(int[] arr, int low, int high) {
		if(low < high) {
			int mid = (low+high) / 2;
			MergeSort(arr, low, mid);
			MergeSort(arr, mid+1, high);
			Merger(arr, low, mid, high);
		}
	}
	
	public static void Merger(int[] arr, int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		int k = low;
		int[] brr = new int[arr.length];
		while(i <= mid && j <= high) {
			if(arr[i] <= arr[j]) {
				brr[k] = arr[i];
				i++;
			}
			else {
				brr[k] = arr[j];
				j++;
			}
			k++;
		}
		if(i>mid) {
			while(j <= high) {
				brr[k] = arr[j];
				j++;
				k++;
			}
		}
		else {
			while(i <= mid) {
				brr[k] = arr[i];
				i++;
				k++;
			}
		}
		for(k=low;k<=high;k++) {
			arr[k] = brr[k];
		}
	}

}
