package DemoDemo;


import java.util.Arrays;

public class DemoDemo {
    public static void main(String[] args) {
        int[] nums = {1,2,0,4,0,6,0,0,4};
        Solution solution = new Solution();
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
//code ends here
    }


}
