// Write a Java program to find 2nd largest element in a given array.
package Summer_Internship.ArrayPrograms;
import java.util.Scanner;
public class Array22 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter array elements:");

        for(int i=0;i<size;i++){

            arr[i] = sc.nextInt();
        }
        int largest =arr[0];
        int secondLargest = arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>largest){

                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("second largest  element is:" +  secondLargest);
    }


}
