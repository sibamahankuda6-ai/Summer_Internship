//Write a Java program to print even index values of an array.
package Summer_Internship.ArrayPrograms;
import java.util.Scanner;
public class Array2 {
    static void main(String[] args) {

        Array2 obj = new Array2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("even array index:");
        obj.printEvenIndex(arr, size);
    }
        void printEvenIndex(int arr[],int size){

        for(int i=0;i<size;i++){
               if (arr[i] % 2 == 0) {
                   System.out.println(i);
               }
          }
    }
}

