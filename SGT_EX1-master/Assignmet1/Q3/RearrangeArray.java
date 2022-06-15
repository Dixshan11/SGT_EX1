

import java.util.Arrays;


public class RearrangeArray {
    public static void main(String[] args) {

        int destination=2;
        int pointed=5;

        ReArrange(destination,pointed);
    }

    public static void ReArrange(int index1,int index2){


        int[]numbers= {9,3,6,1,5,2,1,34};
        System.out.println("before swap the array");
        System.out.println(Arrays.toString(numbers));
        int temp=0;
        temp=numbers[index1];
        numbers[index1]=numbers[index2];
        numbers[index2]=temp;

        System.out.println("After swap the array");
            System.out.println(Arrays.toString(numbers));

    }
}
