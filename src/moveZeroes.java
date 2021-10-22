public class moveZeroes {
    public static void main(String[] args) {
        /**
         *
         * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
         * Note that you must do this in-place without making a copy of the array.
         *
         * Input: nums = [0,1,0,3,12]
         * Output: [1,3,12,0,0]
         *
         * Input: nums = [0]
         * Output: [0]
         */
    }

    public static void moveZeroes(int[] nums) {
        int i = 0, j = 1;
        if (nums.length > 1) {
            while (j < nums.length) {
                if (nums[i] == 0 && nums[j] != 0) { // when left is zero
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    i++;
                } else if (nums[i] == 0 && nums[j] == 0) {
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
        }
    }
}