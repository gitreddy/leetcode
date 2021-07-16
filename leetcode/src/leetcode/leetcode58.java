package leetcode;

public class leetcode58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println (lengthOfLastWord(" "));
	}
	
	private static int lengthOfLastWord(String s)
	{
		int retVal = 0;
		s = s.strip();
		
		if (s.length() != 0)
		{
            if (s.lastIndexOf(' ') == (s.length()-1))
		    {
		    	retVal = s.length()-1;
		    }
		    else
		    {
		    	retVal = s.length() - (s.lastIndexOf(' ') + 1);
		    }
        }
		return retVal;
	}
}
