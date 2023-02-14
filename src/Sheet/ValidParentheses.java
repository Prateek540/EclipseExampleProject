package Sheet;
import java.util.*;
public class ValidParentheses {
	    public boolean isValid(String s) {
	        Stack<Character> list = new Stack<>();
	        int i,j=0;
	        char ch, current;
	        for(i=0;i<s.length();i++) {
	            ch = s.charAt(i);
	            if(ch == '[' || ch == '{' || ch == '(') {
	                list.push(ch);
	                j++;
	            }
	            else if((ch == ']' || ch == '}' || ch == ')') &&(list.isEmpty()))
	                return false;
	            else {
	                current = list.pop();
	                if((ch == ']' && current == '[') || (ch == '}' && current == '{') || (ch == ')' && current == '(') )
	                    j--;
	                else
	                    return false;
	                    
	            }
	        }
	        if(j==0)
	        return true;  
	        else
	            return false;
	    }
	}