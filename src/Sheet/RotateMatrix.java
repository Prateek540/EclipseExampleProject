package Sheet;

public class RotateMatrix {
	
	public static void main(String args[]) {
		int[][] arr = { {1,2}, {3,4} };
		int i, j, r=2, c=2;
		for(j=0;j<c;j++) {
			for(i=r-1;i>=0;i--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
