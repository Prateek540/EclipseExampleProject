package Sheet;
import java.util.*;
public class MaxMin {
	public static void main(String args[]) {
		int i;
		int k = 3;
		int[] arr = { 5, 9, 1, 10, 3, 7, 2, 4, 6, 8 };
		List<Integer> list = new ArrayList<Integer>();
		for(i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		Collections.sort(list);
		System.out.println(k+" smallest is "+list.get(k - 1));
		System.out.println(k+" largest is "+list.get(list.size() - k));
	}
}
