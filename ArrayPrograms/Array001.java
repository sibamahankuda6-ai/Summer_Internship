package Summer_Internship.ArrayPrograms;

public class Array001 {
   static void array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 10) {
                    System.out.println(i + "," + j);
                }
            }
        }
    }

    public static void main(String args[]){
        int arr[] =  {4,5,6,5,0,9,8,10,1};
        array(arr);
    }
}
