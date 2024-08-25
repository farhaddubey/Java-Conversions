import java.util.*;

public class StringToInt{
    public static void main(String[] args){
        String s="200";
        //Converting string to int using Integer.parseInt()
        int i=Integer.parseInt(s);
        System.out.println(i);
        System.out.println(s+100); //200100 as + works for concatenations with string
        System.out.println(i+100); //Int+Int, hence300 + works here for concatenation
        // Integer.parseInt() converts String to int
        
    }
}