package Arrays;

public class RecursionBinSearch {
	public static void main(String args[]) {
		RecursionBinSearch ob = new RecursionBinSearch();
		int[] arr = {1,3,5,8,9,10,12,15,17,20};
		System.out.print(ob.BinSearch(arr, 0, arr.length, 13));
	}
	public int BinSearch(int[] arr, int low, int high, int n) {
		if(low>high)
			return -1;
		int mid = (low+high) / 2;
		if(arr[mid] == n)
			return mid;
		else if(arr[mid] > n)
			return BinSearch(arr, low, mid-1,n);
		else
			return BinSearch(arr, mid+1, high,n);
	}
}
