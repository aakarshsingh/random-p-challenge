package Q4;

public class Q4 {
  public static void main(String[] args) {
    int n0 = 11;
    int n1 = 22;
    int n2 = 31;
    int n3 = 15;
    printWhatYouNeed(n0);
    printWhatYouNeed(n1);
    printWhatYouNeed(n2);
    printWhatYouNeed(n3);
  }

  private static void printWhatYouNeed (int n) {
    String bin = Integer.toBinaryString(n);
    char[] arr = bin.toCharArray();
    StringBuilder builder = new StringBuilder();
    for(int i =0; i<arr.length; i++) {
      char charOfInterest = arr[i];
      if(charOfInterest == 49) {
        builder.append("2 ^ ").append(i).append(" , ");
      }
    }
    System.out.println("builder = " + builder);
  }
}
