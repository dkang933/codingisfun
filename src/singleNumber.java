import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class singleNumber {
    public static void main(String[] args) {
        /**
         * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
         * You must implement a solution with a linear runtime complexity and use only constant extra space.
         *
         * Input: nums = [2,2,1]
         * Output: 1
         *
         * Input: nums = [4,1,2,1,2]
         * Output: 4
         *
         * Input: nums = [1]
         * Output: 1
         */

    }

    // my answer using array sort
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i + 1 > nums.length - 1) {
                return nums[i];
            }
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            } else {
                ++i;
            }
        }
        return 0;
    }

    // interesting answer
    // MATH CONCEPT -> 2∗(a+b+c)−(a+a+b+b+c)=c
    // this is faster
    // key concept for this problem is the math concept of two duplicates.
    // also using the contains methods to check whether if its duplicate or not. if duplicaet then dont add to first sum

//    public static int singleNumber(int[] nums) {
//        Set<Integer> set = new HashSet();
//        int setSum = 0;
//        int arraySum = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if (!set.contains(nums[i])) {
//                set.add(nums[i]);
//                setSum += nums[i];
//            }
//
//            arraySum += nums[i];
//        }
//        return 2 * setSum - arraySum;
//    }
}