//. Input-{231,554,572,962,24,1}
//Output-{2,4,2,8,6,1} ( Sum of even digits of each element )
package Summer_Internship.ArrayPrograms;
import java.util.Scanner;
public class Array30 {
    static int sumEvenDigits(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                sum += digit;
            }

            num = num / 10;
        }

        return sum;
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

        System.out.print("Output-{");
        for (int i = 0; i < size; i++) {
            System.out.print(sumEvenDigits(arr[i]));

            if (i < size - 1) {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}
