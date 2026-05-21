package Summer_Internship.NumberProgram;

import java.util.Scanner;

public class SumOfDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int rem,sum=0;
        while(num!=0){
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;

        }
        System.out.println("sum of digit of a number is:" + sum);
    }
}
