package Summer_Internship.ArrayPrograms;

public class Find_numbers {

    void find_last_digit_8(int arr[], int a[]) {

        for (int i = 0; i < arr.length; i++) {
            int rem = arr[i] % 10;

            if (rem == 8) {
                a[i] = arr[i];
            }
        }
    }

    public static void main(String args[]) {

        int arr[] = {58, 555, 218, 78, 0, 9, 8, 18};

        int a[] = new int[arr.length];

        Find_numbers obj = new Find_numbers();

        obj.find_last_digit_8(arr, a);

        System.out.println("Numbers ending with 8:");

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                System.out.println(a[i]);
            }
        }
    }
}