import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class containsDuplicate {
    /**
     * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
     * Input: nums = [1,2,3,1]
     * Output: true
     * <p>
     * Input: nums = [1,2,3,4]
     * Output: false
     * <p>
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */

    public static void main(String[] args) {

    }

    // without using any imports
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

//     with using array import
//    public static boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == nums[i + 1]) {
//                return true;
//            }
//        }
//        return false;
//    }

//    public static boolean containsDuplicate(int[] nums) {
//        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
//        if (set.size() != nums.length) {
//            return false;
//        }
//        return true;
//    }

}