class Solution {
    public int maxProfit(int[] prices) {
                int min_num = Integer.MAX_VALUE;
        int max_num = Integer.MIN_VALUE;
        int min_index = -1;
        int res = 0;
        
        for(int i=0; i<prices.length; i++) {
            if(prices[i] < min_num) {
                min_num = prices[i];
                min_index = i;
            }
            if((prices[i] > min_num) && (i > min_index)) {
                res = Math.max(res, prices[i] - min_num);
            }
        }
        return res;
    }
}