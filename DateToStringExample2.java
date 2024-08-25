import java.text.ParseException; 
import java.text.SimpleDateFormat; 
import java.util.Date; 
import java.util.Locale; 

public class DateToStringExample2{
    public static void main(String[] args){
        Date date=new Date(); 
        SimpleDateFormat formatter=new SimpleDateFormat("MM/dd/yyyy");
        String strDate=formatter.format(date); 
        System.out.println("Date Format with MM/dd/yyyy:"+strDate); 

        formatter=new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        strDate=formatter.format(date); 
        System.out.println("Date Format with dd-M-yyyy hh:mm:ss"+strDate);

        formatter=new SimpleDateFormat("dd MMMM yyyy");
        strDate=formatter.format(date);
        System.out.println(strDate);

    }
}