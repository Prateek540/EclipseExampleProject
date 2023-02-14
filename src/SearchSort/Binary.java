package SearchSort;

public class Binary {
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int n = 10;
		int low= 0, end = 9;
		System.out.println(search(arr, low, end, n));
	}
	
	public static int search(int[] arr, int low, int high, int n) {
		if(low <= high) {
			int mid = (low+high) / 2;
			if(arr[mid] == n)
				return mid;
			else if(arr[mid] > n)
				return search(arr, low, mid-1, n);
			else
				return search(arr, mid+1, high, n);
		}
		return -1;		
	}

}