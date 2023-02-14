package Sheet;

public class Count012 {
	
	public static void main(String args[]) {
		int count0 = 0, count1 = 0, count2 = 0, i;
		int[] arr = {1, 0, 1, 2, 1, 2, 0, 2, 0, 1};
		for(i=0;i<arr.length;i++) {
			if(arr[i] == 0)
				count0++;
			else if(arr[i] == 1)
				count1++;
			else
				count2++;
		}
		i=0;
		while(count0>0) {
			arr[i] = 0;
			i++;
			count0--;
		}
		while(count1>0) {
			arr[i] = 1;
			i++;
			count1--;
		}
		while(count2>0) {
			arr[i] = 2;
			i++;
			count2--;
		}
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
