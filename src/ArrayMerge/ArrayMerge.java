package ArrayMerge;

import java.util.Arrays;

public class ArrayMerge {

    public static void main(String[] args) {

        int[] arr1 = {2,3,7,8};
        int[] arr2 = {3,4,5,6};

        int[] arr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr.length; i++) {
            arr[i] = arr2[i- arr1.length];
        }

        Arrays.sort(arr);
        //String s = Arrays.toString(arr);

        for (int j : arr) {
            System.out.println(j);
        }

    }

}
