//Write a Java program to sort array elements using the sort() method
package Summer_Internship.ArrayPrograms;
import java.util.*;
public class Array55 {
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 6, 1, 2, 7};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        sortArray(arr);
    }
}
