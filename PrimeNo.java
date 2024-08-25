import java.util.*;
import java.util.Scanner;

public class PrimeNo{
    public static void main(String[] args){
                System.out.println("Enter the no.");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=2; i<=9; i++){
            if(i==num){
                continue;

            }
            if(num%i==0){
                System.out.println("The no."+num+"is Non Prime No.");
                break;
            }else{
                System.out.println("The no. is Prime no.");
                break;
            }
        }
    }
}