package DemoDemo;


import java.util.*;

public class DemoDemo {
    public static void main(String[] args) {
        int[] nums1 = {2, 4, 1, 5, 5};
        int[] nums2 = {2, 2, 5, 5, 8};
        List<Integer> integers = new ArrayList<>();
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        for (int num : nums1) {
            if (integerIntegerMap.containsKey(num)) {
                integerIntegerMap.put(num, integerIntegerMap.get(num) + 1);
            } else integerIntegerMap.put(num, 1);
        }
        for (int num : nums2) {
            if (integerIntegerMap.containsKey(num)) {
                if (integerIntegerMap.get(num) > 0) {
                    integers.add(num);
                    integerIntegerMap.put(num, integerIntegerMap.get(num) - 1);
                }
            }
        }
        System.out.println(integers);


//code ends here
    }


}
