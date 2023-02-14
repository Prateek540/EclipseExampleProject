package Sheet;

public class ReverseArray {
	public static void main(String args[]) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int i = 0, t;
		int j = arr.length - 1;
		while(i < j) {
			t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}
		System.out.println("Reversed array is ");
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
