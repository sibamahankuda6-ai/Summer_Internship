//Write a Java program to store characters in an array and print the characters in reverse order.
package Summer_Internship.ArrayPrograms;
import java.util.Scanner;
public class Array1 {
    static void main(String[] args) {
        Array1 obj = new Array1();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();
        char[] arr = new char[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next().charAt(0);
        }
        System.out.println("character array:");
        obj.charArray(arr,size);
    }
    void charArray(char arr[],int size){

        for(int i=size-1;i>=0;i--){
            System.out.println(arr[i]);

        }



    }
}
