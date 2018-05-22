public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        ArrayList<ArrayList<Integer>> anagrams = new ArrayList<>();
        HashMap<String, ArrayList<Integer>> table = new HashMap<>();
        char[] charArray;
        ArrayList<Integer> index;
        String sortedS;
        for (int i = 0; i < A.size(); i++) {
            charArray = A.get(i).toCharArray();
            Arrays.sort(charArray);
            sortedS = new String(charArray);
            if (table.containsKey(sortedS)) {
                s.get(sortedS).add(i);
            } else {
                index = new ArrayList<>(Arrays.asList(i));
                table.add(sortedS, Arrays.asList(i));
            }
        }
        for (ArrayList<Integer> list : table.valueSet()) {
            anagrams.add(list);
        }
        return anagrams;
    }
}

