// String can be converted to Class Object using Class.forName() method. The Class.forName() method returns 
// the instance of Class class which can be assigned to get the meta data of any class. 

public class StringToClassObject{
    public static void main(String[] args){
        Class c=Class.forName("java.lang.lang");
        System.out.println("Class Name"+c.getName());
        System.out.println("Super class Name"+c.getSuperclass().getName());
    }
}