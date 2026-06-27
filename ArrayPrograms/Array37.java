// Input-{1,2,3,4} delete 2nd index element
//output-{1,2,4}
package Summer_Internship.ArrayPrograms;
import java.util.*;
public class Array37 {
    static void deleteElement(int arr[], int size, int index) {

        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.print("Output-{");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(arr[i]);
            if (i < size - 2)
                System.out.print(",");
        }
        System.out.println("}");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter index to delete: ");
        int index = sc.nextInt();

        deleteElement(arr, size, index);

        sc.close();
    }

}
