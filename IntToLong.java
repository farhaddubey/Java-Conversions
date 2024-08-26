// We can convert int->long in java using assignment operator. As lower type can be converted to higher type 
// implicitly, but higher type can not converted in the same way. 
// For that we have to use explicit type casting. 


public class IntToLong{
    public static void main(String[] args){
        int i=200; 
        long l=i; 
        System.out.println(l);
    }
}