// Object can be converted to String using Java, .toString() method of Object class or String.valueOf(object)
// We can convert any object to Java whether it's User-defined class, StringBuilder, StringBuffer or anythings else
class Emp{}
public class ObjectToString{
    public static void main(String[] args){
        Emp e=new Emp();
        String s=e.toString();
        String v2=String.valueOf(e);
        System.out.println(s);
        System.out.println(v2);
    }
}