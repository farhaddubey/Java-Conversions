
public class StringToChar1{
    public static void main(String[] args){
        String s="hello"; 
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            System.out.println("The character at "+i+"th index is :"+c);
        }
    }
}