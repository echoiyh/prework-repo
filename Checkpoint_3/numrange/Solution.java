public class Solution {
    public int numRange(ArrayList<Integer> A, int B, int C) {
        int size = A.size();
        int range = 0;
        int i = 0;
        int j = i;
        int sum = 0;
        while (i < size) {
            sum += A.get(j);
            if (sum >= B && sum <= C) {
                range++;
                j++;
            } else if (sum < B) {
                j++;
            } else if (sum > C) {
                i++;
                j = i;
                sum = 0;
            }
            if (j == size) {
                i++;
                j = i;
                sum = 0;
            }
        }
        return range;
    }
}
