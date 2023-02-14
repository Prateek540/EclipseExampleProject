package SearchSort;
import java.util.*;

public class Linear {
	
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] arr = {1,2,3,4,5,6,7,8,9,10};
			int i, n;
			boolean found = false;
			System.out.println("enter the no. to search");
			n = sc.nextInt();
			for(i=0;i<10;i++) {
				if(arr[i] == n) {
					System.out.println("element found at index "+i);
					found = true;
					break;
				}
			}
			if(found == false)
				System.out.println("entered no. not found");
		}
	}
}
