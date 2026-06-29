// Write a Java program to convert numbers into words
//Input-2917
//Output-two thousand nine hundred seventeen
package Summer_Internship.ArrayPrograms;
import java.util.*;
public class Array42 {

        static String[] ones = {
                "", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
        };

        static String[] tens = {
                "", "", "twenty", "thirty", "forty",
                "fifty", "sixty", "seventy", "eighty", "ninety"
        };

        public static void convert(int n) {

            if (n == 0) {
                System.out.println("zero");
                return;
            }

            if (n >= 1000) {
                System.out.print(ones[n / 1000] + " thousand ");
                n %= 1000;
            }

            if (n >= 100) {
                System.out.print(ones[n / 100] + " hundred ");
                n %= 100;
            }

            if (n >= 20) {
                System.out.print(tens[n / 10] + " ");
                n %= 10;
            }

            if (n > 0) {
                System.out.print(ones[n]);
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            convert(n);

            sc.close();
        }
    }

