package Summer_Internship.NumberProgram;
import java.util.Scanner;
public class SpyNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        int product = 1;
        int temp = num;

        while (temp > 0) {
            int rem = temp % 10;

            sum = sum + rem;
            product = product * rem;

            temp = temp / 10;
        }

        if (sum == product) {
            System.out.println(num + " is a Spy Number");
        } else {
            System.out.println(num + " is not a Spy Number");
        }
    }
}
