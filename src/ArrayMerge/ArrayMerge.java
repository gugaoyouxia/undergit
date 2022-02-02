package ArrayMerge;

import java.util.Arrays;

public class ArrayMerge {

    public static void main(String[] args) {

        int[] arr1 = {2,3,7,8};
        int[] arr2 = {3,4,5,6};

        int[] arr = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, arr, 0, arr1.length);
        System.arraycopy(arr2, 0, arr, arr1.length, arr.length - arr1.length);

        Arrays.sort(arr);
        //String s = Arrays.toString(arr);

        for (int j : arr) {
            System.out.println(j);
        }

    }

}
