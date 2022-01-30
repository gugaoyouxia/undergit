import java.util.Arrays;

public class solution {
    public int[] nums;
    public int target;

    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ret[0] = nums[i];
                    ret[1] = nums[j];
                }
            }
        }
        return ret;
    }

    public void printRet() {
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }


}
