public class breakloop {
    public static void main(String[] args) {
        // for (int i = 0; i < 20; i++) {
        //   System.out.println(i);
        //   if ( i >= 12) break; 
        // }

        // continue
        for (int i = 0; i < 20; i++) {
            if ( i == 2 || i == 8)continue;
            if (i >= 16)break;
            System.out.println(i);
            
          }

    }
}
