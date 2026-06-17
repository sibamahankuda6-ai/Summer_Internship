//Write a Java program to print vowels present in an array.
package Summer_Internship.ArrayPrograms;

import java.util.Scanner;

public class Array12 {
    public static void main(String[] args) {

        Array12 obj = new Array12();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int size = sc.nextInt();

        char arr[] = new char[size];

        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next().charAt(0);
        }

        obj.printVowels(arr, size);
    }

    void printVowels(char arr[], int size) {

        System.out.println("vowels:");

        for (int i = 0; i < size; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' ||
                    arr[i] == 'o' || arr[i] == 'u' ||
                    arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' ||
                    arr[i] == 'O' || arr[i] == 'U') {

                System.out.print(arr[i] + " ");
            }
        }

    }
}
