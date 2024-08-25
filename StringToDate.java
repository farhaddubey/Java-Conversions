//We can convert String to Date in Java using parse() method of DateFormat and SimpleDateFormat class. 
import java.util.Date; 
import java.text.SimpleDateFormat; 

public class StringToDate{
    public static void main(String[] args)throws Exception{
        String sDate1="31/12/1998";
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        System.out.println(sDate1+"\t"+date1);
    }
}