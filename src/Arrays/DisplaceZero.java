package Arrays;

public class DisplaceZero {
	public static void main(String args[]) {
		int[] arr = {8,1,0,2,1,0,3};
		int i,j=0,temp;
		for(i=0;i<arr.length;i++) {
			if(arr[i] !=0 && arr[j] == 0) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if(arr[j] != 0)
				j++;
		}
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
