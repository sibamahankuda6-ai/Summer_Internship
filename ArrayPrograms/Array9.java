//Write a Java program to print odd elements sum.
package Summer_Internship.ArrayPrograms;

import java.util.Scanner;

public class Array9 {
    static void main(String[] args) {

        Array9 obj = new Array9();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        obj.sumOfOddElements(arr, size);
    }
    void sumOfOddElements(int arr[],int size){
        int sumOdd =0;
        for(int i=0;i<size;i++) {

            if (arr[i] % 2 ==1) {
                sumOdd = sumOdd + arr[i];
            }
        }
        System.out.println("sum of even elements :" + sumOdd);
    }

}
