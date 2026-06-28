//Write a Java program to shift half of the elements to the right side of the array.
//Input-{2,5,8,9,3,1}
//output-{9,3,1,2,5,8}
package Summer_Internship.ArrayPrograms;
import java.util.*;
public class Array40 {
    static void shiftHalf(int[] arr) {
        int n = arr.length;
        int mid = n / 2;

        int[] temp = new int[n];
        int k = 0;

        // Copy second half
        for (int i = mid; i < n; i++) {
            temp[k++] = arr[i];
        }

        // Copy first half
        for (int i = 0; i < mid; i++) {
            temp[k++] = arr[i];
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        // Print array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        shiftHalf(arr);

        sc.close();
    }
}

