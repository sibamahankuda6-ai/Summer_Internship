//nput-{1,2,3,4} insert 5 in index 3
//output-{1,2,3,5,4}
package Summer_Internship.ArrayPrograms;
import java.util.*;
public class Array36 {
    static int[] insert(int arr[], int value, int index) {

        int newArr[] = new int[arr.length + 1];

        // Copy elements before the index
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new element
        newArr[index] = value;

        // Copy remaining elements
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        int result[] = insert(arr, value, index);

        System.out.print("Output: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
