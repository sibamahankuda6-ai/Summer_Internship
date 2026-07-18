package ArrayPrograms;
import java.lang.String;
public class Array002 {
    static void array1(int arr[], int narr[]) {
        for (int i = 0; i < arr.length; i++) {
            int mul = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                mul = mul * arr[j];
            }
            narr[i] = mul;
        }

    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4};
        int narr[] = new int[arr.length];
        array1(arr, narr);
        System.out.println("the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(narr[i]);
        }
    }
}


