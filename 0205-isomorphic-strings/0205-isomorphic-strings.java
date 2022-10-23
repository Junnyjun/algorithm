import java.util.*;
class Solution {
    HashMap<Character,Character> map = new HashMap();
    public boolean isIsomorphic(String s, String t) {
        int len = s.length(); // suppose s and t length is same
        for(int i = 0 ; i < len ; i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(i == 0){
                map.put(sc,tc);
            }else{
                if(map.containsKey(sc)){
                    //s 에서 이미 나온 글자라면 지금 t와 비교
                    if(map.get(sc) != tc){
                        return false;
                    }
                }//end of if
                //s에서 나오지 않은 글자인데 예를들어 ab aa 일때 b를 비교하는 경우
                //egg add 의 경우 e a // g d
                else if(map.containsValue(tc)){
                    //s는 새로운게 나왔는데 t에 기존에 있던게 있으면 안되지 
                    return false;
                }
            }//end of else
            map.put(sc,tc);
        }//end of loop
        return true;
    }
}