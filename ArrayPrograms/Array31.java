//Write a Java program to merge two arrays.
//Input-1-{1,2,3}
//Input-2-{4,5,6}
//output-{1,2,3,4,5,6}
package Summer_Internship.ArrayPrograms;
import java.util.Scanner;
public class Array31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int merged[] = new int[n1 + n2];


        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }


        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }

        System.out.print("Output-{");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i]);
            if (i < merged.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}
