public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int kthsmallest(final List<Integer> A, int B) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(B, new MinComparator());
        for (Integer i : A){
            queue.offer(i);
            if (queue.size() > B){
                queue.poll();
            }
        }
        return queue.peek();
    }

    private class MinComparator implements Comparator<Integer> {
        public int compare(Integer x, Integer y) {
            return y - x;
        }
    }
}
