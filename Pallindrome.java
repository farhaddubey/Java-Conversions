import java.util.*; 
import java.util.Scanner; 

public class Pallindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. ");
        int num=sc.nextInt();
        int numE=num;
        int result=0;
        int rem;
        while(num!=0){
            rem=num%10;
            num/=10;
            result=result*10+rem;
        }
        System.out.println("The reverse of the no. "+numE+"is: "+result);
    }
}