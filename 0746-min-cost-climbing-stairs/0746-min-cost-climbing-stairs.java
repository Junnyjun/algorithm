class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int [] storage=new int[n+1];
        
        storage[n]=0;
        storage[n-1]=cost[n-1];
        for(int i=n-2;i>=0;i--){
            int op1=storage[i+1];
            int op2=storage[i+2];
            storage[i]=Math.min(op1,op2)+cost[i];
        }
        int a=storage[0];
        
        storage=new int[n+1];
        storage[n]=0;
        storage[n-1]=cost[n-1];
        for(int i=n-2;i>0;i--){
            int op1=storage[i+1];
            int op2=storage[i+2];
            storage[i]=Math.min(op1,op2)+cost[i];
        }
        int b=storage[1];
        return Math.min(a,b);
        
    }
}