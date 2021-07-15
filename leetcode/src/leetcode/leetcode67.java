package leetcode;

public class leetcode67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println (addBinary ("110111", "101"));
	}
    public static String addBinary(String a, String b) {
    	String retVal = "";
    	
    	String temp ="";
    	int i;
    	String carry = "0";
    	
    	int longLength, shortLength; 
    	String longStr, shortStr;

    	if (a.length () >= b.length())
    	{
    		longStr = a;
    		shortStr = b;

    	}
    	else
    	{
    		longStr = b;
    		shortStr = a;
    	}
    	
    	//System.out.println ("rem : " + rem);
    	//System.out.println ("rem length : " + remLength);
    	//System.out.println ("com Length : " + comLength);
    	int diff = longStr.length() - shortStr.length();
    	
    	for (i=shortStr.length()-1; i > -1; i--)
    	{
    		temp = "";
    		temp = temp + longStr.charAt(i+diff);
    		temp = temp + shortStr.charAt(i);
    		temp = temp + carry;
    		
    		System.out.println ("temp = " + temp);
    		switch (temp)
    		{
    			case "000" : retVal = "0" + retVal; break;
    			case "100" : retVal = "1" + retVal; break;
    			case "010" : retVal = "1" + retVal; break;
    			case "001" : retVal = "1" + retVal; carry = "0"; break;
    			case "011" : retVal = "0" + retVal; break; // carry is already 1 - so keep it.
    			case "101" : retVal = "0" + retVal; carry = "1"; break;
    			case "110" : retVal = "0" + retVal; carry = "1"; break;
    			case "111" : retVal = "1" + retVal; break; // carry is already 1 - so keep it.
    		}
        	System.out.println ("sum " + retVal + " carry "+carry);
    	}

    	System.out.println ("first round " + retVal + "carry "+carry);
    
     	for ( i = diff-1 ; i > -1 ; i--)
    	{
    		temp = longStr.charAt(i) + carry;
    		//System.out.println (temp);
 		
    		switch (temp)
	    	{
				case "00" : retVal = "0" + retVal; break;
				case "01" : retVal = "1" + retVal; carry = "0"; break;
				case "10" : retVal = "1" + retVal; carry = "0"; break;
				case "11" : retVal = "0" + retVal; break; // carry is already 1 - so keep it.
	    	}
        	//System.out.println ("now " + retVal + "carry "+carry);
    	}
    	
    	if (carry.equals("1"))
    	{
    		retVal = "1" + retVal ;
    	}
    	
    	//System.out.println (retVal);
   	   	return retVal;
    }
}
