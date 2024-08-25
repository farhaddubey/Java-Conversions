import java.util.*;

public class IntToStringExample1{
    public static void main(String[] args){
        int i=200;
        String s=String.valueOf(i); //converts to String 
        Float f=Float.valueOf(i);
        Long l=Long.valueOf(i);
        System.out.println(f);
        System.out.println(l);
        System.out.println(i+100);
        System.out.println(s+100);
    }
}