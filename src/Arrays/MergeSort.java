package Arrays;

public class MergeSort {//T --> O(n log n) S --> O(N)
	public static void main(String args[]) {
		int[] arr = {23,12,34,57,24,89,11,6,57,65};
		int i = 0, l = arr.length;
		System.out.println("Array is ");
		display(arr);
		Merge(arr, i, l-1);		
		System.out.println("Sorted Array is ");
		display(arr);
	}
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void Merge(int[] arr, int lb, int ub) {
		if(lb<ub) {
			int mid = (lb+ub)/2;
			Merge(arr,lb,mid);
			Merge(arr,mid+1,ub);
			merger(arr,lb,mid,ub);
		}
	}
	public static void merger(int[] arr, int lb, int mid, int ub) {
		int i = lb;
		int j = mid+1;
		int k = lb;
		int[] brr = new int[arr.length];
		while(i<=mid&&j<=ub) {
			if(arr[i]<=arr[j])
			{
				brr[k] = arr[i];
				i++;
			}
			else
			{
				brr[k] = arr[j];
				j++;
			}
			k++;
		}
		if(i>mid)
		{
			while(j<=ub)
			{
				brr[k] = arr[j];
				j++;
				k++;
			}
		}
		else
		{
			while(i<=mid)
			{
				brr[k] = arr[i];
				i++;
				k++;
			}
		}
		for(k=lb;k<=ub;k++) {
			arr[k] = brr[k];
		}
	}
}