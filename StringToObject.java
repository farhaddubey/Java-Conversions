// String can be converted to object using Assignment Operator. Each class is internally a child class of Object class
// . So Strings can be directly assigned to Objects.
// String can also be converted to object using Class.forName() method 

// String s="hello";
// Object obj=s;

public class StringToObject{
    public static void main(String[] args){
        String s="hello";
        Object obj=s;
        System.out.println(obj);
    }
}