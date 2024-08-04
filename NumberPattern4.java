public class NumberPattern4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for(int j=i;j<=i;j++){
                if (i==1) {
                    System.out.print(i);
                }
                int k=i-1;
                System.out.print(k+" ");
            } 
         
            System.out.println();
        }
    }
}
