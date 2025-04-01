package java_Array;

import java.util.Scanner;

public class FindMaxValue_MinValueOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements for the array");
        int num = sc.nextInt();
        int array[] = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter the element" + (i + 1) + ":");
            array[i] = sc.nextInt();

        }
        findmax_min_in_array(array);
    }

    public static void findmax_min_in_array(int arr[]) {
        int length = arr.length;
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }


            for (int j = 0; j < length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                }
            }
        }
            System.out.println(max + "  is the max valued element");

            System.out.println(min + "  is the min valued element");




    }

}
