package leetcode;

public class leetcode28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ( strStr ( "mississippi", "issipi"));

	}
	
	
    public static int strStr(String haystack, String needle) 
    {
    	int retVal = -1;
    	
    	if (needle.length() == 0)
    	{
    		retVal = 0;
    	}
    	else if (needle.length() > haystack.length() || (haystack.indexOf(needle.charAt(0)) == -1))
    	{
    		retVal = -1;
    	}
    	else 
    	{
    		int i=haystack.indexOf(needle.charAt(0));
    		
    		while (i < haystack.length())
   	        {
    			int j;
    			//optimization hack
    			if (haystack.charAt(i) == needle.charAt(0) && (i+needle.length()-1) < haystack.length() && (haystack.charAt(i+needle.length()-1) == needle.charAt (needle.length() -1)))
    			{
            		for (j=0; (j<needle.length() && (i+j)< haystack.length() && (haystack.charAt(i+j)) == needle.charAt(j)); j++)
                    {
                    			//System.out.println (i + " : " + j);
                    			//System.out.println (haystack.charAt(i) + " == " + needle.charAt(j));
                    			//matched = true;
                    }  
            		if ( j == needle.length())
            		{
            			retVal = i;
            			break;
            		}
    			}
	       		//System.out.println (i + " : " + j);
        		//System.out.println (haystack.charAt(i) + " ? " + needle.charAt(j));
       			i++;
	
   	        }
    	}
    	return retVal;

    }

}
