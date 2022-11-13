class Solution {
    public static int myAtoi(String s) {
        String str = s.stripLeading().split("\\s+")[0];

        if (str.length() == 0) {
            return 0;
        } else if (str.charAt(0) == '+') {
            return convert(str.substring(1), false);
        } else if (str.charAt(0) == '-') {
            return convert(str.substring(1), true);
        } else if (Character.isDigit(str.charAt(0))) {
            return convert(str, false);
        } else {
            return 0;
        }
    }

    public static int convert(String s, boolean isNegative) {
        long value = 0;

        for (int idx = 0; idx < s.length() && Character.isDigit(s.charAt(idx)); idx++) {
            value = value * 10 + Character.getNumericValue(s.charAt(idx));

            if (value > Integer.MAX_VALUE) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }

        return (int) (isNegative ? -value : value);
    }
}