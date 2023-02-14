package Strings;
import java.util.*;

public class Pangram {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			String s,m="";
			int i,index;
			boolean[] arr = new boolean[26];
			System.out.println("Enter the String");
			s = sc.nextLine();
			for(i=0;i<s.length();i++) {
				if('A' <= s.charAt(i) && s.charAt(i) <= 'Z')
					index = s.charAt(i) - 'A';
				else if('a' <= s.charAt(i) && s.charAt(i) <= 'z')
					index = s.charAt(i) - 'a';
				else
					continue;
				arr[index] = true;
			}
			for(i=0;i<26;i++) {
				if(arr[i] == false)
					m = m + ((char)(i + 97));
			}
		System.out.println(m);
		}
	}
}
