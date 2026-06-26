//Write a Java program to find the length of an array without using the length attribute.
package Summer_Internship.ArrayPrograms;
import java.util.Scanner;
import java.util.Arrays;
public class Array34 {
    static int findLength(int arr[]) {
        String s = Arrays.toString(arr);   // Example: [10, 20, 30]
        s = s.substring(1, s.length() - 1); // Remove [ and ]

        if (s.isEmpty()) {
            return 0;
        }

        int count = 1;
        for (char ch : s.toCharArray()) {
            if (ch == ',') {
                count++;
            }
        }
        return count;
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("length of the  array " + findLength(arr));
    }
}
