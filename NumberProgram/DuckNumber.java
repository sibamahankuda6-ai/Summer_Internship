package Summer_Internship.NumberProgram;

import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        boolean isDuck = false;

        while (temp > 0) {

            int rem = temp % 10;

            if (rem == 0) {
                isDuck = true;
                break;
            }

            temp = temp / 10;
        }

        if (isDuck) {
            System.out.println(num + " is a Duck Number");
        } else {
            System.out.println(num + " is not a Duck Number");
        }
    }
}
