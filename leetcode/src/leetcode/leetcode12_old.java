package leetcode;

public class leetcode12_old {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println (intToRoman (48));

	}
	
    public static String intToRoman(int num) {
    	String retVal = "";
    	String orig = Integer.toString((num));
    	
    	for (int i=0; i<orig.length(); i++)
    	{
    		retVal += returnRomanLiteral (orig.charAt(i), (int) Math.pow(10, orig.length()-(i+1)));
    	}
        return retVal;
    }
    
    private static String returnRomanLiteral(char x, int pos)
    {
    	System.out.println (x + " : " + pos);
    	String retVal = "";
    	boolean nineVal = false;
    	boolean fourVal = false;
    	int[] dividers = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    	String[] roman = new String [] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
    	
    	switch (pos)
    	{
    		case (1) :
    		{
    			int n = Character.getNumericValue (x);
    			if (n > 5)
    			{
    				n -=5;
    				retVal += 'V';
    			}
    			for (int i=0; i<n; i++)
    			{
    				retVal = retVal + "I";
    			}
    			break;
    		}
    		case (10) : 
    		{
    			if (x=='5')
    			{
    				retVal += 'L'; break;
    			}
    			else 
    			{
    				retVal += 'X'; break; 
    			}
    		}
    		case (100) :
    		{
    			if (x=='5')
    			{
    				retVal += 'D'; break;
    			}
    			else 
    			{
    				retVal += 'C'; break; 
    			}
    		}
    		case (1000) : retVal += 'M'; break;
    	}
    	
    	System.out.println (retVal);
    	return retVal;
    }

}
