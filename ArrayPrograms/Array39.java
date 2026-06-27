//Write a Java program to print common elements present in two arrays.
//Input-1-{1,2,4,5,6}
//Input-2-{2,5,8,9,3,1}
//output-{1,2,5}
package Summer_Internship.ArrayPrograms;
import java.util.*;
public class Array39 {
    static void distinct(int a[], int b[]) {

        System.out.print("Output-{");

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i] + " ");
                }

            }

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter first array elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int b[] = new int[m];

        System.out.println("Enter second array elements:");
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();

        distinct(a, b);

        sc.close();
    }

}
