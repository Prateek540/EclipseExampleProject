package Sheet;

public class Move {
	public static void main(String args[]) {
		int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		int i = 0, j = arr.length - 1, t;
		while(i <= j) {
			if(arr[i] < 0 && arr[j] < 0) {
				i++;
			}
			else if(arr[i] > 0 && arr[j] < 0) {
				t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				i++;
				j--;
			}
			else if(arr[i] > 0 && arr[j] > 0) {
				j--;
			}
			else {
				i++;
				j--;
			}
		}
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}