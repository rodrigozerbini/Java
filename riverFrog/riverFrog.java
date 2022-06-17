import java.util.HashMap;
class Solution {
    public int solution(int X, int[] A) {
        int position, time;
        HashMap<Integer, Boolean> pos_covered = new HashMap<Integer, Boolean>();
        for (time = 0; time < A.length; time++) {
            position = A[time];
            if (!pos_covered.containsKey(position)) {
                pos_covered.put(position, true);
                if (pos_covered.size() == X) 
                    break;
            }
        }
        if (pos_covered.size() == X)
            return time;
        else
            return -1;
    }
}
