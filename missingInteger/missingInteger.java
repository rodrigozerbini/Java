import java.util.HashSet;
class Solution {
    public int solution(int[] A) {
        int smallest = 1;
        HashSet<Integer> numbers = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            numbers.add(A[i]);
            if (A[i] == smallest) {
                while (numbers.contains(smallest))
                    smallest += 1;
            }
        }
        return smallest;
    }
}
