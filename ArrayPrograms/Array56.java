package Summer_Internship.ArrayPrograms;

//Write a Java program to arrange the given string array into ascending order.
//input-{“Ram”,” Amar”,” Cel”,” David”,” Bunny”}
//output-{” Amar”,” Bunny”,” Cel”,” David”,”Ram”}
import java.util.Arrays;

public class Array56 {

    public static void sortStrings(String[] arr) {
        Arrays.sort(arr);

        System.out.println("Sorted String Array:");
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Ram", "Amar", "Cel", "David", "Bunny"};

        System.out.println("Original Array:");
        for (String str : arr) {
            System.out.print(str + " ");
        }

        System.out.println();

        sortStrings(arr);
    }
}
