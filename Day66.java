import java.util.Scanner;


public class Day66 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("masukkan panjang");
        int A = sc.nextInt();
        System.out.println("masukkan lebar");
        int B = sc.nextInt();
        for (int a = 0; a < A; a++) {
        for (int b = 0; b < B; b++) {
        System.out.print("* ");
            }
        System.out.println();
            
        }
    }

}
