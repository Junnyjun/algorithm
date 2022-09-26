import java.math.BigDecimal;

class Solution {
    public int reverse(int x) {
        int sign = 1;
        // 만약 negative의 수라면 마지막에 -를 붙혀 반환하기 위해 저장해놓는다.
        if (x < 0) {
            sign = -1;
        }
        
        // input 수를 절대값으로 변환한다. 
        x = Math.abs(x);
        
        int curr = 0;
        int prev = 0;
        
        while (x > 0) {
            int digit = x % 10;
            curr = (curr * 10) + digit;

            // 결과 값을 다시 거꾸로 계산한다. 
            int newPrev = (curr - digit) / 10;
            
            // 만약 prev와 newPrev의 값이 다르다면 오버플로우가 생겼다는 뜻이다. 
            if (prev != newPrev) {
                return 0;
            }
            
            x /= 10;
            prev = curr;
        }
        
        return curr * sign;
}
}