package Summer_Internship.NumberProgram;

import java.util.Scanner;

public class LargestOfThreeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number;");
        int a = sc.nextInt();
        System.out.println("Enter 2st number;");
        int b = sc.nextInt();
        System.out.println("Enter 3st number;");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("largest is a" + " " + a);
        }
        else if(b>a && b>c){
            System.out.println("largest is b" + " " + b);
        }
        else{
            System.out.println("largest is c" + " " + c);
        }
    }
}
