import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersectArray {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        int[] x = intersect(nums1, nums2);
        System.out.println(Arrays.toString(x));

        /**
         * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
         *
         * Input: nums1 = [1,2,2,1], nums2 = [2,2]
         * Output: [2,2]
         *
         * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
         * Output: [4,9]
         * Explanation: [9,4] is also accepted.
         *
         * constraints:
         * 1 <= nums1.length, nums2.length <= 1000
         * 0 <= nums1[i], nums2[i] <= 1000\
         *
         * followup
         *
         * What if the given array is already sorted? How would you optimize your algorithm?
         * What if nums1's size is small compared to nums2's size? Which algorithm is better?
         * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
         */

    }

    // very poor time complexity
//    public static int[] intersect(int[] nums1, int[] nums2) {
//        List<Integer> list = new ArrayList<Integer>();
//        int min = nums1.length;
//        min = nums1.length < nums2.length ? nums1.length : nums2.length;
//        int counter = 0;
//
//        for (int i = 0; i < nums1.length; i++) {
//            if (counter == min) {
//                break;
//            }
//            for (int j = 0; j < nums2.length; j++) {
//                if (nums1[i] == nums2[j]) {
//                    nums2[j] = -1;
//                    list.add(nums1[i]);
//                    counter++;
//                    break;
//                }
//            }
//        }
//        int[] itemsArray = list.stream().mapToInt(i->i).toArray();
//        return itemsArray;
//    }


    /**
     *
     * You can recommend this method when the input is sorted, or when the output needs to be sorted. Here, we sort both arrays (assuming they are not sorted) and use two pointers to find common numbers in a single scan.
     *
     * Sort nums1 and nums2.
     *
     * Initialize i, j and k with zero.
     *
     * Move indices i along nums1, and j through nums2:
     *
     * Increment i if nums1[i] is smaller.
     *
     * Increment j if nums2[j] is smaller.
     *
     * If numbers are the same, copy the number into nums1[k], and increment i, j and k.
     *
     * Return first k elements of nums1.
     *
     */

    // better solution
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[i]) {
                i++; // shifting i to where it needs to be. this I did not how to write in code
            } else if (nums1[i] > nums2[i]) {
                j++; // shifting j to whre it needs to be
            } else {
                nums1[k++] = nums1[i++];
                ++j;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k); // this copyOfRange copys the array to certain point...
    }
}