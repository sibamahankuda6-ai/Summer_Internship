//Write a Java program to print odd elements present in an array.
package Summer_Internship.ArrayPrograms;

import java.util.Scanner;

public class Array5 {
    static void main(String[] args) {

        Array5 obj = new Array5();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("odd array elements:");
        obj.printOddElement(arr, size);
    }
    void printOddElement(int arr[],int size){

        for(int i=0;i<size;i++){

            if (arr[i] % 2 == 1) {
                System.out.println(arr[i]);
            }



        }
    }
}
