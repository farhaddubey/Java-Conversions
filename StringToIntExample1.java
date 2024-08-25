
// The parseInt() is the static method of Integer class. The signature of parseInt() method is given below: 
// public static int parseInt(String s)
// Java String to int Example: Integer.parseInt()
// int i=Integer.parseInt("200");

// Java Program to demonstrate the conversion of String into int 
// using Integer.parseInt() method 
public class StringToIntExample1{
    public static void main(String[] args){
        //Declaring String variables 
        String s="hello";
        int s_interger=Integer.parseInt(s);
        System.out.println(s_interger);
        //+ works as concatenaotr with strings, & like operators with Int
        System.out.println(300+s);
        System.out.println(300+s_interger);
    }
}