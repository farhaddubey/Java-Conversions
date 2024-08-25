// We can convert Double to String using Double.toString() method or using String.valueOf() method. 
// public static String valueOf(double d)
// double d=12.3 
// String s=String.valueOf(d);
public class DoubleToString{
    public static void main(String[] args){
        double d=89.7;
        String s=Double.toString(d); 
        System.out.println(s);

    }
}