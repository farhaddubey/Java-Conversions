// If we direct assign char value too int it'll return ASCII value of the character. 
// Character is always written inside single colon while String inside double colon 
public class CharToInt{
    public static void main(String[] args){
        char c='a'; 
        char c2='1'; 
        int a=c; 
        int b=c2; 
        System.out.println(a); 
        System.out.println(b);
    }
}