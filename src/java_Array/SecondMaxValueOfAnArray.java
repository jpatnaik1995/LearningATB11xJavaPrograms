package java_Array;

import java.util.Scanner;

public class SecondMaxValueOfAnArray {
    public int findSecondMax(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num of elements in the array: " );
        int num=sc.nextInt();

        int a[]=new int[num];
        int size=a.length;
        for(int k=0;k< size;k++){
            System.out.print("Enter element"+(k+1)+":");
            a[k]=sc.nextInt();
        }

        int max1=0;
        int max2=0;
        for(int i=0;i<size;i++){
            if(a[i]>max1) {
                max2 = max1;
                max1 = a[i];
            }
            else if(a[i] != max1 && max2 < max1 && a[i]>max2)
            max2=a[i];
        }
        System.out.print("first max: "+max1);
        System.out.println("second max: "+max2);

        return max2 ;

    }

    public static void main(String[] args) {
    SecondMaxValueOfAnArray s1=new SecondMaxValueOfAnArray();
    s1.findSecondMax();
    }
}
