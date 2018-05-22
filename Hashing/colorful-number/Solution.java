public class Solution {
    public int colorful(int A) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        while (A > 0) {
            int temp = A % 10;
            list.add(temp);
            A = A / 10;
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                int p = 1;
                for (int k = i; k <= j; k++) {
                    p *= list.get(k);
                }
                if (set.contains(p)) {
                    return 0;
                }
                set.add(p);
            }
        }
        return 1;
    }
}

