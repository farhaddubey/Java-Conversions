// // Long.toString() also converts Long to String ie .toString() that'll get converted to String 
// long i=90909090L; 
// String s=Long.toString(i); //Now it'll return "99999999";


public class LongToStringExample2{
    public static void main(String[] args){
        Long l=90909090l;
        String s=Long.toString(l);
        System.out.println(s+100); //Now + will act as concatenator 
        System.out.println(l+100);
    }
}