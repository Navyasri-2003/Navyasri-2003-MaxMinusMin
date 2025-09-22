
import java.util.List;

public class MaxMinusMin {
    public int difference(List<Integer> nums){
        if (nums == null || nums.isEmpty()) return 0;
        int min = nums.get(0);
        int max = nums.get(0);
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return max - min;
    }
}
