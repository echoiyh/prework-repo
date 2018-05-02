public class Solution {
    public ArrayList<Integer> nextGreater(ArrayList<Integer> A) {
        ArrayList<Integer> ret = new ArrayList<>();
        int next;
        for (int i = 0; i < A.size()-1; i++) {
            next = -1;
            for (int j = i+1; j < A.size(); j++) {
                if (A.get(j) > A.get(i)) {
                    next = A.get(j);
                    break;
                }
            }
            ret.add(next);
        }
        ret.add(-1);
        return ret;
    }
}
