package leetcode;

import java.util.HashMap;
import java.util.Hashtable;

public class leetcode20 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println (isValidString ("([]){"));
	}

    public static boolean isValidString (String s) {
        String stack="";
        boolean retVal = false;
        
        char [][] map = { {'(', ')'}, {'{', '}'}, {'[', ']'}};


        for (int i=0;i<s.length() && s.length() > 1; i++)
        {
        	if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
        	{
        		stack+=s.charAt(i);
        	}
        	else
        	{
        		if (stack.length() > 0 && isMatch (stack.charAt(stack.length()-1), s.charAt(i),  map))
        		{
        			stack = stack.substring(0, stack.length() - 1);
        			retVal = true;
        		} 
        		else
        		{
        			retVal = false;
        			break;
        		}
        	}
        }
        return (retVal && stack.length() == 0);
    }
    private static boolean isMatch(char a,char b, char[][] map)
    {
    	boolean retVal = false;
    	System.out.println ( a + " : "+ b);
    	for (int i=0; i<map.length; i++)
    	{
    		if (a == map[i][0] && b == map[i][1])
    		{
    			retVal = true;
    			break;
    		}
    	}
    	return retVal;
    }
}
