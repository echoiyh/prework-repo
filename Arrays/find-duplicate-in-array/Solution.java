public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    int n = a.size();
	    boolean[] table = new boolean[n+1];
	    for (Integer i : a) {
	        if (table[i]) {
	            return i;
	        } else {
	            table[i] = true;
	        }
	    }
	    return -1;
	}
}

