package DemoDemo;

import java.util.ArrayList;

public class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                arrayList.add(i);
            } else {
                if (count < arrayList.size()) {
                    exchange(nums, i, arrayList.get(count));
                    arrayList.add(i);
                    count++;
                }
            }


        }
    }

    public void exchange(int[] nums, int i, int j) {
        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int findSmallest(ArrayList<Integer> arrayList, int count) {
        int temp = arrayList.get(count);
        for (int i = count; i < arrayList.size(); i++) {
            if(arrayList.get(i) < temp){
                temp = arrayList.get(i);
            }
        }
        return temp;
    }
}
