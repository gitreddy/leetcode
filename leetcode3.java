package leetcode;

public class leetcode3
{
	
	public static void main (String[] args)
	{
		System.out.println (lengthOfLongestSubstring ("abcabcbb"));
	}
	/* This is a program that solves a different logic - to see the length of max repeated substring.
	 * public static int lengthOfLongestSubstring(String s) {
	 * 
	 * int length; int retval = 0;
	 * 
	 * for (length=s.length()/2; length>2; length--) { for (int subs = 0; (subs+
	 * (s.length()/length*length))<s.length() && (retval==1); subs++) {
	 * System.out.println (s.substring(subs, subs+length)+ " : "+
	 * s.substring(subs+length, subs+length+length)); if (s.substring(subs,
	 * subs+length).equals(s.substring(subs+length, subs+length+length))) {
	 * retval=length; break; }
	 * 
	 * } } return retval; }
	 */
	
	public static int lengthOfLongestSubstring (String s)
	{
		int retVal = 0;
		int temp;
		
		if (s.length () < 2)
		{
			retVal = s.length();
		}
		else 
		{
			for (int i=0; i<s.length();i++)
			{
				temp = recursePos (s.substring(i));	
				retVal = retVal < temp ? temp : retVal;			
			}
		}

		return retVal;
	}
	
	private static int recursePos(String s)
	{
		int retVal = 0;
		
		System.out.println (s);
		if (s.length() == 1)
		{
			retVal = 1;
		}
		else if (s.length() == 2) // Hack* UGLY for "ab" like pattern
		{
			if (s.charAt(0) != s.charAt(1))
			{
				retVal = 2;
			}
			else
			{
				retVal= 1;
			}
		}
		else 
		{
			for (int j = 1; j < s.length(); j++)
			{
				if (s.charAt(0) == s.charAt(j))
				{
					retVal = j;
					break;
				}
				else
				{
					int temp = recursePos (s.substring((j)));
					retVal = retVal < temp ? temp : retVal;			
	
				}
	
			}
		}
		System.out.println (retVal);
		return retVal;
	}

}
