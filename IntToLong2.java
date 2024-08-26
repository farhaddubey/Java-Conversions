// Converting Int to Long object using Long.valueOf() method 

public class IntToLong2{
    public static void main(String[] args){
        int i=100;
        // Long l=new Long(i); //it has been deprecated 
        // only Long.valueOf(i) method is used  
        Long l2=Long.valueOf(i); 
        System.out.println(l2);        
    }
}