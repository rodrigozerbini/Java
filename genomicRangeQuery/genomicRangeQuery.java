import java.util.HashMap;
class Solution {
    // HashMap that stores position indexes and their
    // respective impact factors
    HashMap<Integer, Integer> pos_value = new HashMap<Integer, Integer>();

    // Function that returns the impact of a nucleotide
    public int getImpact(char a) {
        if (a == 'A') 
            return 1;
        else if (a == 'C')
            return 2;
        else if (a == 'G')
            return 3;
        else
            return 4;
    }
    // Function that checks if there is some 'A' in S between position p and q
    // in the hashtable    
    public boolean searchA(String S, int p, int q, HashMap<Integer, Integer> map) {
        for (int i = p; i <= q; i++) {
            if (map.get(i) != null && map.get(i) == 1)
                return true;
        }
        return false;
    }
    public int[] solution(String S, int[] P, int[] Q) {
        int[] minImpact = new int[P.length];
        int p, q;
        int min, impact;
        for (int i = 0; i < P.length; i++) {
            min = 5;
            p = P[i];
            q = Q[i];
            // search for some 'A' between positions p and q (in the hashtable)
            if (searchA(S, p, q, pos_value) == true)
                minImpact[i] = 1;
            else {
                for (int j = p; j <= q; j++) {
                    impact = getImpact(S.charAt(j));
                    if (pos_value.get(j) == null) {
                        pos_value.put(j, impact);
                    }
                    if (impact < min) {
                        min = impact;
                        minImpact[i] = min;
                        if (impact == 1) 
                            break;
                    }
                }
            }
        }
        return minImpact;
    }
}
