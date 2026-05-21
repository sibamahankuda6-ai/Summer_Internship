package Summer_Internship.NumberProgram;

import java.util.Scanner;

public class ReverseANumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int rem,reverse=0;
        while(num!=0){
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;

        }
        System.out.println("Reverse number is:" + reverse);
    }
}
