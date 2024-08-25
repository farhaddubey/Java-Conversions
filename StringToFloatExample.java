public class StringToFloatExample{
    public static void main(String[] args){
        String s="23.6"; 
        float f=Float.parseFloat(s);
        // int i=Integer.parseInt(s);
        // System.out.println(i);
        // Goe erroe as String contains a float type of data 
        System.out.println(f);
    }
}