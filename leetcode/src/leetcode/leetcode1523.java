package leetcode;

public class leetcode1523 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println (countOdds(278382788,569302584));

	}
    public static int countOdds(int low, int high) {
        int retVal = 0;
        
        if (low %2 == 0 && high %2 == 0)
        {
        	retVal = (high-low)/2;
        }
        else if (low %2 == 0 && high %2 !=0)
        {
        	retVal = (high-low)/2 + 1;
        }
        else if (low %2 !=0 && high %2 !=0)
        {
        	retVal = (high -low)/2 +1;
        }
        else if (low %2 !=0 && high %2 == 0)
        {
        	retVal = (high - low)/2 + 1;
        }
        return retVal;
    }
	
}

