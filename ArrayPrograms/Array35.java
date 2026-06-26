//. Write a Java program to print repeated elements present in an array.
//Input-{1,2,3,4,3,2}
//Output-{2,3}
package Summer_Internship.ArrayPrograms;
import java.util.*;
public class Array35 {
    static void printRepeated(int arr[]) {

        System.out.print("Repeated elements are: ");

        for (int i = 0; i < arr.length; i++) {

            boolean repeated = false;

            // Check if the element has already been printed
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    repeated = true;
                    break;
                }
            }

            if (repeated) {
                continue;
            }

            // Check if the element is repeated later
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        printRepeated(arr);

        sc.close();
    }
}
