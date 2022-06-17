class Solution {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int v;
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            v = A[i];
            if (v <= N) {
                counters[v-1] += 1;
                if (counters[v-1] > max) 
                    max = counters[v-1];
                
            }
            else {
                for (int j = 0; j < counters.length; j++) 
                counters[j] = max;

            }
        }
        return counters;
    }
}
