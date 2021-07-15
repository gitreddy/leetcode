package leetcode;

public class leetcode38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println (countAndSay(123));

	}
	
    public static String countAndSay(int n) {
        String retVal="";
        
        int temp = -1;
        int ctr = 0;
        
        for ( ; n > 0 ; n/=10)
        {
        	System.out.println (temp + " : " + ctr);
        	if (temp == -1 || ctr == 0)
        	{
        		System.out.println ("here1");
        		temp = n%10;
        		ctr ++;
        	}
        	else if (temp  == (n % 10))
        	{
        		System.out.println ("here2");
        		ctr++;
        	}
        	else
        	{
        		System.out.println ("here3");
        		retVal += ctr;
        		retVal += temp;
        		ctr=0;
        		temp = n%10;
        	}
        	System.out.println (n);
        }
        return retVal;
    }
}   

