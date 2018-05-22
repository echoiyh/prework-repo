public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int A) {
        ArrayList<ArrayList<Integer>> pascal = new ArrayList<>();
        if (A < 1) {
            return pascal;
        }
        ArrayList<Integer> row = new ArrayList<>();
        row.add(1);
        pascal.add(row);
        for (int i = 1; i < A; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= pascal.get(i-1).size(); j++) {
                if (j == 0 || j == pascal.get(i-1).size()) {
                    row.add(j, 1);
                } else {
                    row.add(j, pascal.get(i-1).get(j-1)+pascal.get(i-1).get(j));
                }
            }
            pascal.add(row);
        }
        return pascal;
    }
}

