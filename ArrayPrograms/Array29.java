// Write a Java program to add elements of 2 arrays.
//Test case -1
//Input-1-{2,3,4,1}
//Input-2-{2,3,5,6,7,8,9}
//Output-{4,6,9,7,7,8,9}
//Test case -2
//Input-1-{2,3,5,6,7,8,9}
//Input-2-{2,3,4,1}
//Output-{4,6,9,7,7,8,9}
package Summer_Internship.ArrayPrograms;
import java.util.Scanner;
public class Array29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array 1: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];

        System.out.println("Enter elements of Array 1:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of Array 2: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];

        System.out.println("Enter elements of Array 2:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int max = Math.max(n1, n2);
        int result[] = new int[max];

        for (int i = 0; i < max; i++) {
            if (i < n1 && i < n2) {
                result[i] = arr1[i] + arr2[i];
            } else if (i < n1) {
                result[i] = arr1[i];
            } else {
                result[i] = arr2[i];
            }
        }

        System.out.print("Output-{");
        for (int i = 0; i < max; i++) {
            System.out.print(result[i]);
            if (i < max - 1) {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}
