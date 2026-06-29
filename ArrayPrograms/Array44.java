//Write a Java program to remove the elements present before the given index
//number.
//Test case-1
//a={1,2,4,5,1,3,2}
//Index-3
//Output-{5,1,3,2}
//Test case-2
//a={1,2,4,5,1,3,2}
//Index-5
//output-{3,2}
package Summer_Internship.ArrayPrograms;
import java.util.*;
public class Array44 {
    public static void removeBeforeIndex(int[] a, int index) {

        if (index < 0 || index >= a.length) {
            System.out.println("Invalid Index");
            return;
        }

        int[] result = new int[a.length - index];

        for (int i = index, j = 0; i < a.length; i++, j++) {
            result[j] = a[i];
        }

        System.out.print("Output-{");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        removeBeforeIndex(a, index);

        sc.close();
    }
}
