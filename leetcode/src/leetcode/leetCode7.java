package leetcode;

public class leetCode7 {
	
	public static void main (String[] args)
	{
		System.out.println (reverse (1534236469));
	}

	    public static int reverse(int x) {
	    	int retVal = 0;
            boolean neg = false;
            if (x<0)
            {
                neg = true;
                x=x*-1;
            }
	        while (x>=1)
	        {        	
	        	if (((long) retVal * 10) > Integer.MAX_VALUE)
	        	{
	        		retVal = 0;
	        		break;
	        	}
	        	retVal = (retVal * 10) + (x % 10);
	        	retVal = retVal < Integer.MAX_VALUE ?retVal : 0;
	        	x = x/10;
	        }
            if (neg)
            {
                retVal*=(-1);
            }
	        return retVal;
	    }

}
