package Summer_Internship.NumberProgram;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println(n);
        }
        if(n==1){
            System.out.println(0);
        }
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
