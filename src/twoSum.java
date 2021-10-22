import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {
        /**
         * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
         * You may assume that each input would have exactly one solution, and you may not use the same element twice.
         * You can return the answer in any order.
         *
         * Input: nums = [2,7,11,15], target = 9
         * Output: [0,1]
         * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
         *
         * Input: nums = [3,2,4], target = 6
         * Output: [1,2]
         *
         * Input: nums = [3,3], target = 6
         * Output: [0,1]
         *
         * As I look through each number of array I want to remember if i have seen it and ifso then where? so use MAP!
         * I will map the index to the number appears.
         * current + x = target;
         * x = target - current
         * coming up with this formula is the first step then I know that i need to find the missing pice within array
         * which we can store as map to get it later.
         */
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i]; // if comp + nums[i] = target
            if (map.containsKey(comp)) {
                return new int[] {map.get(comp), i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    // faster than the brute force but too slow.
//    public static int[] twoSum(int[] nums, int target) {
//        int[] copyNums = Arrays.copyOf(nums, nums.length);
//        Arrays.sort(nums);
//        int i = 0, x = 0, y = 0;
//        int j = nums.length -1;
//        boolean check = true;
//        while (check) {
//            if (nums[i] + nums[j] == target) {
//                x = nums[i];
//                y = nums[j];
//                check = false;
//            } else if (nums[i] + nums[j] > target) {
//                j--;
//            } else {
//                i++;
//            }
//        }
//        boolean checked = true;
//        for (int k = 0; k < copyNums.length; k++) {
//            if (copyNums[k] == x && checked){
//                nums[0] = k;
//                checked = false;
//            }
//            if (copyNums[k] == y) {
//                nums[1] = k;
//            }
//
//        }
//        return Arrays.copyOfRange(nums, 0, 2);
//    }
}