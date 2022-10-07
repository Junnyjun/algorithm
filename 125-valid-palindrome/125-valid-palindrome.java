class Solution {
    public boolean isPalindrome(String s) {
        String s1 = Arrays.stream(s.split(""))
            .filter(c -> c.matches("[\\da-zA-Z]"))
            .collect(Collectors.joining()).toLowerCase();
        String s2 = new StringBuilder(s1.toLowerCase()).reverse().toString();
        boolean equals = s1.equals(s2);
        return equals;
    }
}