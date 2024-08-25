public class StringToIntExample{
    public static void main(String[] args){
        String s="200";
        // Converting string into Integer 
        int i=Integer.valueOf(s); // /Integer.parseInt(s)
        System.out.println(s+100); //Concatenated as String 
        System.out.println(i+100); //Added as they are int 
    }
}