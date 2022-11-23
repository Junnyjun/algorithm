class Solution {
    public String solution(String s) {
        int min = 2147000;
        int max = -2147000;

        String[] s1 = s.split(" ");
        for (String element : s1) {
            int num = Integer.parseInt(element);
            if(num > max){
                max = num;
            }else if(num < min){
                min = num;
            }
        }
        return min+" "+max;
    }
}