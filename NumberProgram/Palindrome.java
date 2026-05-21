package Summer_Internship.NumberProgram;

import java.util.Scanner;

public class Palindrome {
        static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            int rem, temp, reverse = 0;
            temp = num;
            while (num != 0) {
                rem = num % 10;
                reverse = reverse * 10 + rem;
                num = num / 10;

            }
            if (temp == reverse) {
                System.out.println("Number is palindrome");
            } else {
                System.out.println("not a palindrome");
            }
        }
}
