package q1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class Q1 {
  private static final Map<Integer, String> mapper = new HashMap<>();
  public static void main(String[] args) {
    populateMap();
    Map<Integer, String> sorted = sortByKey();
    StringBuilder ans = new StringBuilder();
    for(int i=1; i<=100; i++) {
      int num = i;
      for (Entry<Integer, String> entry : sorted.entrySet()) {
        Integer j = entry.getKey();
        String s = entry.getValue();
        while (num >= j) {
          num = num - j;
          ans = ans.append(s);
        }
      }
      System.out.println("num = " + i);
      System.out.println("ans = " + ans);
      System.out.println("");
      ans = new StringBuilder();
    }
  }

  private static Map<Integer, String> sortByKey() {
    Map<Integer, String> sorted = new TreeMap<>(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
      }
    });
    sorted.putAll(mapper);
    return sorted;
  }

  private static void populateMap() {
    mapper.put(1, "I");
    mapper.put(10, "X");
    mapper.put(100, "C");
    mapper.put(4, "IV");
    mapper.put(40, "XL");
    mapper.put(5, "V");
    mapper.put(50, "L");
    mapper.put(9, "IX");
    mapper.put(90, "XC");
  }
}