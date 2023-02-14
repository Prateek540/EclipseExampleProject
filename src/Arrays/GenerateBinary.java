package Arrays;
import java.util.*;
public class GenerateBinary {
	public static void main(String args[]) {
		String arr[];
		arr = generateBinary(5);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);			
		}
	}
	public static String[] generateBinary(int n) {
		String[] result = new String[n];
		Queue<String> queue = new LinkedList<>();
		queue.offer("1");
		for(int i=0;i<n;i++) {
			result[i] = queue.poll();
			String n1 = result[i] + "0";
			String n2 = result[i] + "1";
			queue.offer(n1);
			queue.offer(n2);
		}
		return result;
	}
}
