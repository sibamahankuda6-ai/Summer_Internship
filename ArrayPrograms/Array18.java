// Write a Java program to find the minimum occured element in a given array.
package Summer_Internship.ArrayPrograms;
import java.util.Scanner;
public class Array18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean visited[] = new boolean[n];
        int minCount = n + 1;
        int minElement = arr[0];

        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count < minCount) {
                minCount = count;
                minElement = arr[i];
            }
        }

        System.out.println("Minimum occurred element: " + minElement);
        System.out.println("Occurrences: " + minCount);

        sc.close();
    }
}
