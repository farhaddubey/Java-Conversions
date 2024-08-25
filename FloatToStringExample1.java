// Float can be converted to string using eithere Float.toString() or String.valueOf() methods.  
// public static String valueOf(float f) 

public class FloatToStringExample1{
    public static void main(String[] args){
        float f=12.4F;
        String s=String.valueOf(f);
        System.out.println(s+100);
        System.out.println(f+100);

    }
}