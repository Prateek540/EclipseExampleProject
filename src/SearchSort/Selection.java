package SearchSort;

public class Selection {
	public static void main(String args[]) {
		int[] arr = {12,34,10,45,67,8,89,76,1,38};
		int i, j, mi, t;
		for(i=0;i<arr.length - 1;i++) {
			mi = i;
			for(j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[mi])
					mi = j;
			}
			t = arr[mi];
			arr[mi] = arr[i];
			arr[i] = t;
		}
		System.out.println("Sorted array is ");
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
