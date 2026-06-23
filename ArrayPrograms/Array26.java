// Write a Java program to remove the elements present more than once.
//Input-{1,2,1,3,2,4}
//Output-{3,4}
package Summer_Internship.ArrayPrograms;

import java.util.Scanner;

public class Array26 {
    public void printUnique(int arr[]) {

        System.out.print("Output: {");

        boolean first = true;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
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

        Array26 obj = new Array26();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        obj.printUnique(arr);
    }
}
