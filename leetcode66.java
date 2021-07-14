package leetcode;


public class leetcode66 {
	
	public static void main(String args[])
	{
		int arr[] = {9};
		System.out.println (plusOne (arr));
	}
	
    public static int[] plusOne(int[] digits) {
    	int[] retVal;
    	retVal = new int[digits.length];
		int carry = 1;
    		
       	for (int i=digits.length-1; i>-1; i--)
      	{
       		if (digits[i] != 9)
       		{
       			retVal[i] = digits[i]+carry;  		
           		carry = 0;
           	}
           	else
           	{
           		retVal[i] = (digits[i]+carry)%10;
           		carry = (digits[i]+carry)/10;
          	}
        }
       	
       	if (carry == 1)
       	{
       		int [] temp = new int[retVal.length + 1];
       		for (int i=0; i<retVal.length; i++)
       		{
       			temp[i+1] = retVal[i];
       		}
       		temp[0] = 1;
       		retVal = temp;
       	}
       	
       	return retVal;
    }
}
