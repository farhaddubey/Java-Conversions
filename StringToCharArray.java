// toCharArray() method of String class converts String into Character array. 

public class StringToCharArray{
    public static void main(String[] args){
        String s1="hello"; 
        char[] ch=s1.toCharArray(); 
        char[] helloArray=s1.toCharArray(); 
        char[] stringtoArray=s1.toCharArray(); 
        char[] charArray=s1.toCharArray(); 
        
        for(int i=0; i<ch.length; i++){
            System.out.println("Char at "+i+"th is "+ch[i]);
        }
    }
}
