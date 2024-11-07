public class ternaryOperators {
    public static void main(String[] args) {
        int a = 12;
        int b = 23;
        int c = 123;
        int max = 0;
          
      max = a>b ? a>c ? a : c: b>c ? b:c;

      System.out.println("max" +max);

    }
}
