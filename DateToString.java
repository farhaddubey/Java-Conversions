// We can convert Date to String in Java using format method of java.text.DateFormat class 
// format() method is used to convert Date into String. DateFormat is an abstract class.
// String format(Date d) 
// Date date=Calendar.getInstance().getTime();
// DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
// String strDate=dateFormat.format(date);

import java.text.DateFormat; 
import java.text.SimpleDateFormat; 
import java.util.Date; 
import java.util.Calendar; 
public class DateToString{
    public static void main(String[] args){
        Date date=Calendar.getInstance().getTime(); 
        //Fetched the date 
        DateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        String strDate=dateFormat.format(date); 
        System.out.println("Converted String: "+strDate);
    }
}