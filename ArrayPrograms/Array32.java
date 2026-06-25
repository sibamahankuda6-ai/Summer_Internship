// Write a Java program to shift zeros (0) to the right side of the array.
//Input-{2,0,5,3,1,0,3,1}
//output-{2,5,3,1,3,1,0,0}
package Summer_Internship.ArrayPrograms;
import java.util.*;
public class Array32 {
    public void shiftZero(int arr[]) {
        int index = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }


        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }


        System.out.print("Output-{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Array32 obj = new Array32();
        obj.shiftZero(arr);

        sc.close();
    }
}
