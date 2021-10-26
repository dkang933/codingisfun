public class reerseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    // this one works for integer using stringbuilder reverse.
    public static int reverse(int x) {
        String str = Integer.toString(x);
        Boolean negative = false;
        if (str.charAt(0) == '-') {
            str =  Integer.toString(x).substring(1 ,str.length());
            negative = true;
        }
        String newStr = new StringBuilder(str).reverse().toString();
        if (negative) {
            return Integer.parseInt(newStr) * -1;
        }
        return Integer.parseInt(newStr);
    }

        // if x = 123
        // if x = -4566
    // this method is pretty smart because we use modulo to get the remainder which is the last number
    // and then divide numver with 10 which will give round down cuz in computer science. and then keep add up
    // no need to convert to string or anything here
    // very clever way.

//        public long reverse(long x) {
//            long rev = 0;
//            while (x != 0) {
//                long pop = x % 10;
//                x /= 10;
//                if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
//                if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
//                rev = rev * 10 + pop;
//            }
//            return rev;
//        }
}
