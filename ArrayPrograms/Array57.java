// Write a Java program to arrange the given character array into ascending order.
//input-{R, A, C, D, B}
//output-{A, B, C, D, R}
package Summer_Internship.ArrayPrograms;

import java.util.Arrays;

public class Array57 {
    public static void sortCharacters(char[] arr) {
        Arrays.sort(arr);

        System.out.println("Sorted Character Array:");
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
    }

    public static void main(String[] args) {
        char[] arr = {'R', 'A', 'C', 'D', 'B'};

        System.out.println("Original Character Array:");
        for (char ch : arr) {
            System.out.print(ch + " ");
        }

        System.out.println();

        sortCharacters(arr);
    }
}


