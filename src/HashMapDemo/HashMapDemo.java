package HashMapDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapDemo {

    public int[] twoSum(int[] nums, int target) {

        int[] ret = new int[2];
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            integerIntegerHashMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (integerIntegerHashMap.containsKey(target - ret[i]) && integerIntegerHashMap.get(target - ret[i]) != i) {
                ret[0] = i;
                ret[1] = integerIntegerHashMap.get(target - ret[i]);
            }
        }
        return ret;

    }

}
