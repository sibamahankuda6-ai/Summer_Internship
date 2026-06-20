// Input-{1,2,3,4,5}
//Output-{1,4,9,16,25} ( square of each element )
package Summer_Internship.ArrayPrograms;

import java.util.Scanner;

public class Array19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Output-");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] * arr[i] + " ");


            }
        sc.close();
        }



    }


