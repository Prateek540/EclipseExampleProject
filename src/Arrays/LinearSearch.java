package Arrays;
import java.util.Scanner;
public class LinearSearch {//T --> O(N) S --> O(1)
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int n,i,x,k;
			System.out.println("Enter the size of array");
			n = sc.nextInt();
			int[] arr = new int[n];
			for(i=0;i<n;i++) {
				System.out.println("Enter "+(i+1)+" element");
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter the element you want to search in array");
			x = sc.nextInt();
			k = search(arr,n,x);
			if(k == -1)
				System.out.println("Element "+x+" not present in array");
			else
				System.out.println("Element "+x+" present at "+k);
		}
	}
	public static int search(int[] arr, int n, int x) {
		for(int i=0;i<n;i++) {
			if(arr[i] == x)
				return i;
		}
		return -1;
	}
}