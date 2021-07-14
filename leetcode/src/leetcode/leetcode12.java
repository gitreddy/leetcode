package leetcode;

public class leetcode12 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println (intToRoman (48));

		}
		
	    public static String intToRoman(int num) {
	    	String retVal = "";
	    	int[] dividers = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	    	String[] romans = new String [] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
	    	
	    	while (num > 0)
	    	{
	    		for (int div = 0; div < dividers.length; div ++)
	    		{
	    			int val = num / dividers[div];
	    			for (int i=0; i<val; i++)
	    			{
	    				retVal += romans[div];
	    			}
	    			num = num % dividers[div];
	    		}
	    	}
	    	return retVal;
	    }
	     
}
