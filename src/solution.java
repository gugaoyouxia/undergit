import java.util.Arrays;

public class solution {
    public int[] nums;
    public int target;

    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ret[0] = i;
                    ret[1] = j;
                }
            }
        }
        return ret;
    }

    public void printRet() {
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }


}
