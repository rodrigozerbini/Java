import java.util.*;
class Solution {
    public int solution(int[] A) {
        int missing = 0;
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for (int n = 1; n <= A.length + 1; n++)
            map.put(n, false);

        for (int i = 0; i < A.length; i++) 
            map.replace(A[i], true);
        
        for (Integer key : map.keySet()) {
            if (map.get(key) == false) {
                missing = key;
                break;
            }
        }
        return missing;
    }
}
