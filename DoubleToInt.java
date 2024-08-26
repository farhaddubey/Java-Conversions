// We can convert Double to int using typecasting  
// To convert Double datatype to int we can perform typecasting  
 
 public class DoubleToInt{
    public static void main(String[] args){
        double d=10.5; 
        int i=(int) d; // Explicitly mentioned type to be converted is int 
        int j=d.intValue(); //Double object can be converted to int using .intValue() method of Double class.
        System.out.println(i);
    }
 }