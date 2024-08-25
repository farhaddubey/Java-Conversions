// converting Stringbuilder object to String in Java 
public class ObjectToString2{
    public static void main(String[] args){
        String s="Hello";
        StringBuilder sb=new StringBuilder(s);
        // Again converting String to StringBuilder object 
        String s2="Hey there, What's up? What are you - doing.";
        StringBuilder sbo=new StringBuilder(s2);
        sbo.reverse();
        // Back converstion to String and pringint 
        System.out.println("String 2 is : "+sbo.toString());
        
        sb.reverse();
        String rev=sb.toString();
        System.out.println("String is: "+s);
        System.out.println("Reverse String is: "+rev);
    }
}