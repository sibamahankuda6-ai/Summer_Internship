//Write a Java program to print missing elements.
//Input-{2,4,6,8,13}
//output-{3,5,7,9,10,11,12} 
package Summer_Internship.ArrayPrograms;
import java.util.*;
public class Array41 {
    static void printMissing(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
                System.out.print(j + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printMissing(arr);

        sc.close();
    }
}
