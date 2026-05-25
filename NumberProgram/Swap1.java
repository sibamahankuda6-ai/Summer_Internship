package Summer_Internship.NumberProgram;
import java.util.Scanner;
public class Swap1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int b = sc.nextInt();
        int temp = a;
            a = b;
            b = temp;
        System.out.println("After swap a=" + a  + " " + "b=" + b);
    }
}
