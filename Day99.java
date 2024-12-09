import java.util.Scanner;


public class Day99 {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Angka pertama: ");
        int a = in.nextInt();
        System.out.print("Masukkan Angka Kedua: ");
        int b = in.nextInt();
        System.out.print("Pilih Operasi (+,-,*,/): ");
        char c = in.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println("Hasil: " + (a + b));
                break;
            case '-':
                System.out.println("Hasil: " + (a - b));
                break;
            case '*':
            case 'x':
                System.out.println("Hasil: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Hasil: " + (a / b));
                } else {
                    System.out.println("Error! Tidak dapat membagi dengan nol.");
                }
                break;
            default:
                System.out.println("Error! Operasi tidak dikenal.");
        }
        in.close();
    }
}
