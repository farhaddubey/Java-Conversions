
public class CharToInt2{
    public static void main(String[] args){
        char c='1';
        int a=Character.getNumericValue(c);
        char d='2'; 
        int e=Integer.parseInt(String.valueOf(d));
        System.out.println(a);
    }
}