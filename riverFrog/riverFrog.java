import java.util.HashSet;
class Solution {
    public int solution(int X, int[] A) {
        int position, time;
        HashSet<Integer> pos_covered = new HashSet<Integer>();
        for (time = 0; time < A.length; time++) {
            position = A[time];
            if (!pos_covered.contains(position)) {
                pos_covered.add(position);
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
