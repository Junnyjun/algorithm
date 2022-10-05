class Solution {
 public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();

        while (true) {
            if (n == 1) {
                return true;
            }

            if (set.contains(n)) {
                break;
            }
            set.add(n);
            n = getNextValue(n);
        }

        return false;
    }

    private int getNextValue(int n) {
        int sum = 0;

        while (n > 0) {
            int temp = n % 10;
            sum = sum + (temp * temp);
            n /= 10;
        }
        return sum;
    }
}