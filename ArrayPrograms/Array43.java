// Write a Java program to shuƯle array elements each time we execute the
//program.( using Math.random() method ).
package Summer_Internship.ArrayPrograms;
import java.util.*;
public class Array43 {
    public static void shuffle(int[] a) {

        for (int i = a.length - 1; i > 0; i--) {

            int j = (int) (Math.random() * (i + 1));

            // Swap a[i] and a[j]
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        System.out.print("Shuffled Array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
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

        shuffle(a);

        sc.close();
    }
}
