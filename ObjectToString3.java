public class ObjectToString3{
    public static void main(String[] args){
        String s="nitin";
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String rev=sb.toString();
        if(s.equals(rev)){
            System.out.println("Pallindrome String");
        }else{
            System.out.println("Not pallindrome String");
        }
    }
}
//String--------------->StringBuilder StringBuilder sb=new StringBuilder(s)-------->.reverse()------>String String rev=sb.toString() 
// ----------------->s.equals(rev)-------------->Pallindrome 