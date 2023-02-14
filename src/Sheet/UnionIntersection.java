package Sheet;
import java.util.*;
public class UnionIntersection {
	
	public static void main(String args[]) {
		int arr1[] = { 1, 3, 4, 5, 7 };
        int arr2[] = { 2, 3, 5, 6 };
        int i;
        Set<Integer> treeset = new TreeSet<Integer>();
        Set<Integer> intertree = new TreeSet<Integer>();
        for(i=0;i<arr1.length;i++) {
        	treeset.add(arr1[i]);
        	intertree.add(arr1[i]);
        }
        for(i=0;i<arr2.length;i++) {
        	treeset.add(arr2[i]);
        }
        System.out.println("Union is ");
        for(int num : treeset) {
        	System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("Intersection is ");
        for(i=0;i<arr2.length;i++) {
        	if(intertree.contains(arr2[i]))
        		System.out.println(arr2[i]);
        }
	}
}
