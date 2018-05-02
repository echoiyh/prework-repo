import java.util.*;

public class Solution {
  public ArrayList<ArrayList<Integer>> prettyPrint(int A) {
    ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
    ArrayList<Integer> row;
    for (int i = 0; i < (A*2)-1; i++) {
      row = new ArrayList<>();
      for (int j = 0; j < (A*2)-1; j++) {
        row.add(A);
      }
      ret.add(row);
    }
    int T = 0;
    int B = (A*2)-2;
    int L = 0;
    int R = (A*2)-2;
    while (T <= B && L <= R) {
      for (int i = T; i <= B; i++) {
        for (int j = L; j <= R; j++) {
          ret.get(i).set(j, A);
        }
      }
      T++;
      B--;
      L++;
      R--;
      A--;
    }
    return ret;
  }
}
