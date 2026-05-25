//Write a program to find the factorial of a number
package Summer_Internship.NumberProgram;
import java.util.Scanner;
public class Factorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int fact =1;
        for(int i=1;i<=num;i++){
            fact = fact * i;
        }
        System.out.println("the factorial is" + " " + fact);
    }
}
