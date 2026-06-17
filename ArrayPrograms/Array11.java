//Write a Java program to print prime numbers present in an array.
package Summer_Internship.ArrayPrograms;

import java.util.Scanner;

public class Array11 {

    public static void main(String[] args) {

        Array11 obj = new Array11();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        obj.printPrime(arr, size);
    }

    void printPrime(int arr[], int size) {

        System.out.println("Prime numbers are:");

        for (int i = 0; i < size; i++) {
            int num = arr[i];
            int count = 0;

            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(num + " ");
            }
        }
    }
}