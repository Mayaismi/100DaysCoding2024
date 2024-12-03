public class Day93 {
    public static void main(String[] args) {
        
        int n = 5; 
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }  
            System.out.print("*");
            if (i > 0) {
                for (int k = 0; k < (2 * i - 1); k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
