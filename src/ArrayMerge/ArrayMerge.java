package ArrayMerge;

import java.util.Arrays;

public class ArrayMerge {

    public static void main(String[] args) {

        int[] nums1 = {2,3,7,8};
        int[] nums2 = {3,4,5,6};



        int[] arr = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        double d = ((double)arr[arr.length / 2] + (double)arr[arr.length / 2 - 1] ) / 2;

        System.out.println((double)arr[arr.length / 2]);


        System.out.println(d);



    }

}
