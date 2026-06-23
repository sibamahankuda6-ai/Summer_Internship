// Write a Java program to remove duplicates.
//Input-{1,2,1,3,2,4}
//Output-{1,2,3,4}
package Summer_Internship.ArrayPrograms;
import java.util.Scanner;
public class Array27 {
    public void removeDuplicates(int arr[]) {

        System.out.print("Output: {");

        boolean first = true;

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                if (!first) {
                    System.out.print(",");
                }
                System.out.print(arr[i]);
                first = false;
            }
        }

        System.out.println("}");
    }

    public static void main(String[] args) {

        Array27 obj = new Array27();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        obj.removeDuplicates(arr);
    }
}
