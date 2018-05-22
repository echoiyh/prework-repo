public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        if (A.size() < 2) {
            return A;
        }
        Collections.sort(A);
        int i = 0;
        int j = 1;
        while (j < A.size()) {
            Collections.swap(A, i, j);
            i += 2;
            j += 2;
        }
        return A;
    }
}

