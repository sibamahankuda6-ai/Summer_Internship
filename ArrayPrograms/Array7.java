//Write a Java program to print even index values sum and odd index values sum.
package Summer_Internship.ArrayPrograms;

import java.util.Scanner;

public class Array7 {
    static void main(String[] args) {

        Array7 obj = new Array7();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        obj.sumofEvenIndexAndOddIndex(arr, size);
    }
    void sumofEvenIndexAndOddIndex(int arr[],int size){
        int sumEven =0;
        int sumOdd=0;
        for(int i=0;i<size;i++){

            if (arr[i] % 2 == 0) {
               sumEven = sumEven + i;
            }
            else if (arr[i] % 2 == 1) {
                sumOdd = sumOdd + i;
            }
        }
        System.out.println("sum of Even index :" + sumEven + " " + "sum of Odd index :" + sumOdd);

    }
}
