package leetcode;

import java.time.LocalDate;
import java.util.Hashtable;

public class leetcode1360 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println (daysBetweenDates("2020-01-15", "2019-12-31"));

	}
	
    public static int daysBetweenDates(String date1, String date2) 
    {
    	int days1 = getDays (date1);
    	int days2 = getDays (date2);
    	
    	return (Math.abs(days1 - days2));
    }
    
    private static int getDays (String dateStr) 
    {
    	int retVal = 0;
    	Hashtable <Integer, Integer> months = new Hashtable <Integer, Integer>();
    	
    	months.put(1, 31);
    	months.put(2, 28);
    	months.put(3, 31);
    	months.put(4, 30);
    	months.put(5, 31);
    	months.put(6, 30);
    	months.put(7, 31);
    	months.put(8, 31);
    	months.put(9, 30);
    	months.put(10, 31);
    	months.put(11, 30);
    	months.put(12, 31);
    	
    	try 
    	{
    		LocalDate date = LocalDate.parse(dateStr);
    		for (int i = date.getYear()-1; i > 1969; i--)
    		{
    			retVal +=365; 
                if (i % 4 == 0)
                {
                    if (i % 100 == 0 && i % 400 !=0 )
                    {
                    }
                    else
                    {
                        retVal += 1;
                    }
                }
    		}

            if (date.getMonthValue() > 2 && date.getYear() %4 == 0)
            {
                if (date.getYear() % 100 == 0 && date.getYear() % 400 !=0 )
                {
                }
                else
                {
                    retVal ++ ;
                }
            }
    		
        	for (int i = date.getMonthValue()-1; i > 0; i--)
    		{
    			retVal += months.get(i);
     		}
    		
    		retVal += date.getDayOfMonth();
    	}
    	catch (Exception e)
    	{
    		e.printStackTrace();
    	}
    	return retVal;
    }        
}
