package Arrays;
import java.util.*;
public class BinarySearch {//T --> O(log n) S --> O(log n)
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] arr = {1, 5, 8, 9, 10, 16, 18, 22, 28, 30};
			int low = 0;
			int  high = arr.length - 1;
			int x,mid;
			System.out.println("Enter no. to search");
			x = sc.nextInt();
			while(low <= high) {
				mid = (low+high)/2;
				if(arr[mid] == x) {
					System.out.println("No. found at "+mid+" index");
					return;
				}
				else if(arr[mid] > x)
					high = mid - 1;
				else
					low = mid + 1;
			}
		}			
		System.out.println("Element not found in the sample array");
	}
}
