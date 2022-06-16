import java.lang.Math;
class Solution {
    public int solution(int X, int Y, int D) {
        double jumps = Math.ceil((double) (Y - X) / D);
        return (int) jumps;
    }
}
