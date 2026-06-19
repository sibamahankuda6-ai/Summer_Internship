// Write a Java program to insert even values in an array, the user will enter the values.
package Summer_Internship.ArrayPrograms;
import java.util.Scanner;
public class Array14 {
    public static void main() {
        Array14 obj = new Array14();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size =sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter even values in Array");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("the array elements are:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
