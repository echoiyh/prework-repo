public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int longestConsecutive(final List<Integer> A) {
        Set<Integer> set = new HashSet<>();
        for (Integer i : A) {
            set.add(i);
        }
        int ret = 0;
        int t;
        for (int i = 0; i < A.size(); i++) {
            if (set.contains(A.get(i)-1)) {
                ret = Math.max(ret, 1);
            } else {
                t = 0;
                for (int j = A.get(i); j < A.get(i)+A.size(); j++) {
                    if (set.contains(j)) {
                        t++;
                    } else {
                        break;
                    }
                }
                ret = Math.max(ret, t);
            }
        }
        return ret;
    }
}
