public class reverseSting {
    public static void main(String[] args) {
        /**
         * Write a function that reverses a string. The input string is given as an array of characters s.
         * Must be in O(1)
         *
         * Input: s = ["h","e","l","l","o"]
         * Output: ["o","l","l","e","h"]
         * try to think more as you do this. dont just think about for looping all the time
         */
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length -1;
        while(left < s.length/2) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
