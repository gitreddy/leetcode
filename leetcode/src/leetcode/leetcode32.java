package leetcode;

public class leetcode32 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println (longestValidParanthesis ("()(()"));
	}

    public static int longestValidParanthesis (String s) {
    	        String stack="";
    	        boolean valid = false;
    	        int retVal = 0;
    	        
    	        char [][] map = { {'(', ')'}, {'{', '}'}, {'[', ']'}};


    	        int temp = 0;
    	        
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
    	        			temp+=2; 
    	        			System.out.println (temp + " > " +s.charAt(i));
    	        			stack = stack.substring(0, stack.length() - 1);
    	        			valid = true;
    	        		} 
    	        		else
    	        		{
    	        			valid = false;
    	        			temp = temp - (stack.length() * 2);
    	        			retVal = retVal >= temp ? retVal : temp;
    	        			temp = 0;
    	        			continue;
    	        		}
    	        		
    	        		if (i==(s.length()-1) || valid)
    	        		{
    	        			System.out.println ("here");
    	        			retVal = retVal >= temp ? retVal : temp;
    	        			continue; //ignore this close bracket
    	        		}
 	        		
    	        	}
    	        }
    	        return retVal;
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
    