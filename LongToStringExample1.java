// Long to String in Java can be converted using String.valueOf() /.toString() methods. 
// public static String valueOf(long i) 

public class LongToStringExample1{
    public static void main(String[] args){
        long l=99999999999L; 
        String s=String.valueOf(l);
        System.out.println(s);
    }
}