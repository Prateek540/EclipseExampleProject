package SearchSort;

public class Insert {
	public static void main(String args[]) {
		int[] arr = {23,12,34,57,24,89,11,6,57,65};
		int i, j, temp;
		for(i=1;i<arr.length;i++) {
			temp = arr[i];
			j = i - 1;
			while(j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
