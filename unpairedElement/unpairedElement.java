import java.util.*;
class Solution {
    public int solution(int[] A) {
        int old_count, new_count;
        int unpaired = 0;
        Hashtable<Integer, Integer> hash_table = new Hashtable<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            if (hash_table.containsKey(A[i])) {
                old_count = hash_table.get(A[i]);
                new_count = old_count + 1;
                hash_table.replace(A[i], new_count);
            }
            else {
                hash_table.put(A[i], 1);
            }
        }
        for (Integer key : hash_table.keySet()) {
            if (hash_table.get(key) % 2 != 0) {
                unpaired = key;
                break;
            }
        }
        return unpaired;
    }
}
