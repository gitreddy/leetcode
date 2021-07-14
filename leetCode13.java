package leetcode;

public class leetCode13 
{

    public static void main(String[] args) 
    {
        // TODO Auto-generated method stub
    	System.out.println (romanToInt("IX"));
    }
    
	public static int romanToInt(String s) 
	{
		int retVal = 0;
		for (int i=0; i<s.length(); i++)
		{
			System.out.println (i + " : " + s.charAt(i));
			switch (s.charAt(i))
		    {
		    	case 'I' : { 
		    		if (s.length() != i+1)
		    		{
		    			char c = s.charAt(i+1);
		    			if (s.charAt(i+1) == 'V' || s.charAt (i+1) == 'X')
			    		{
			    			retVal -= 1;
			    			break;
			    		}
		    		}
	    			retVal++; 
		    		break;
		    	}
		    	case 'V' : retVal+=5; break;
		    	case 'X' : {
		    		if (s.length() != i+1)
		    		{
		    			char c = s.charAt(i+1);
		    			if (s.charAt(i+1) == 'L' || s.charAt (i+1) == 'C')
			    		{
			    			retVal -= 10;
			    			break;
			    		}
		    		}
	    			retVal += 10; 
		    		break;
	    		
		    	}
		    	case 'L' : retVal+=50; break;
		    	case 'C' : {
		    		if (s.length() != i+1)
		    		{
		    			char c = s.charAt(i+1);
		    			if (s.charAt(i+1) == 'D' || s.charAt (i+1) == 'M')
			    		{
			    			retVal -= 100;
			    			break;
			    		}
		    		}
	    			retVal+=100; 
		    		break;

		    	}
			    case 'D' : retVal+=500; break;
		    	case 'M' : retVal+=1000; break;
		    }
			System.out.println (retVal);
		}
		return retVal;
	}
}
