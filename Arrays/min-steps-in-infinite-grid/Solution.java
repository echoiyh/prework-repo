public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int size = A.size();
        int step = 0;
        if (size < 2) {
            return step;
        }
        int a = A.get(0);
        int b = B.get(0);
        int nextA;
        int nextB;
        for (int i = 1; i < size; i++) {
            nextA = Math.abs(A.get(i) - a);
            nextB = Math.abs(B.get(i) - b);
            step += Math.max(nextA, nextB);
            a = A.get(i);
            b = B.get(i);
        }
        return step;
    }
}

