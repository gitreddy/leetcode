package leetcode;

public class leetcode9 {

	
	public static void main (String[] args)
	{
		System.out.println (isPalindrome (12));
	}

	    public static boolean isPalindrome(int x) 
	    {
	    	boolean retVal = false;
	    	int rev = 0;
	    	int orig = x;
	    	
            if (x<0)
            {
            	retVal = false;

            }
            else 
            {
            	
            	while (x>=1)
		        {        	
		        	if (((long) rev * 10) > Integer.MAX_VALUE)
		        	{
		        		retVal = false;
		        		break;
		        	}
		        	rev = (rev * 10) + (x % 10);
		        	x = x/10;
		        }
	            if (rev == orig)
	            {
	            	retVal = true;
	            }
            }
	        return retVal;
	    }

}

