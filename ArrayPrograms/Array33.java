//Write a Java program to shift zeros (0) to the left side of the array.
//Input-{2,0,5,3,1,0,3,1}
//output-{0,0,2,5,3,1,3,1}
package Summer_Internship.ArrayPrograms;

import java.util.Scanner;

public class Array33 {
    public void shiftZeroLeft(int arr[]) {
        int index = arr.length - 1;


        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index--;
            }
        }


        while (index >= 0) {
            arr[index] = 0;
            index--;
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

        Array33 obj = new Array33();
        obj.shiftZeroLeft(arr);

        sc.close();
    }
}
