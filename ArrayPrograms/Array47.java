//Write a Java program for binary search. /
package Summer_Internship.ArrayPrograms;
import java.util.*;
public class Array47 {
    public static void binarySearch(int[] arr, int key) {
        Arrays.sort(arr); // Sort the array before binary search

        int low = 0;
        int high = arr.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                index = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
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

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        binarySearch(arr, key);

        sc.close();
    }
}

