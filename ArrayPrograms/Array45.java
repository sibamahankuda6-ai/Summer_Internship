//Write a Java program to copy an array using arraycopy() method./
package Summer_Internship.ArrayPrograms;

import java.util.Scanner;

public class Array45 {
    public static void copyArray(int[] source) {
        int[] destination = new int[source.length];

        // Copy the array
        System.arraycopy(source, 0, destination, 0, source.length);

        // Print copied array
        System.out.println("Copied Array:");
        for (int i = 0; i < destination.length; i++) {
            System.out.print(destination[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        copyArray(arr);

        sc.close();
    }
}
