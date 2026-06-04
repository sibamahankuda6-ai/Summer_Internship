//Write a Java program to print even elements present in an array.
package Summer_Internship.ArrayPrograms;

import java.util.Scanner;

public class Array4 {
    static void main(String[] args) {

        Array4 obj = new Array4();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("even array elements:");
        obj.printEvenElement(arr, size);
    }

    void printEvenElement(int arr[], int size) {

        for (int i = 0; i < size; i++) {

            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }


        }
    }
}
