package lk.ijse;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        reverse(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int tempory = array[start];
            array[start]  = array[end];
            array[end] = tempory;

            start++;
            end--;
        }
    }

}

