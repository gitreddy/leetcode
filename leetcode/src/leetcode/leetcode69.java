package leetcode;

public class leetcode69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println (mySqrt (4));

	}
    public static int mySqrt(int x) {
    	int retVal = 0;
    	int minDiv = 0;
    	int maxDiv = 0;
    	
    	if (x == 1)
    	{
    		retVal = 1;
    	}
    	else 
    	{
    		int div = 0;
    		for (div = x; div > 1; div = div/2)
    		{
    			System.out.println (div + " * " + div + " = " + div*div);
    			if ((div * div) <= x)
    			{
    	    		minDiv = div;

    				break;
    			}
    		}
    	}
    	System.out.println ("min "+minDiv);
    	for (maxDiv = minDiv+1; maxDiv * maxDiv <= x; maxDiv++)
    	{
    		System.out.println ("max " +maxDiv);
    		retVal = maxDiv;
    	}
    	
   	
    	return retVal;
    }
}
