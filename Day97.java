public class Day97 {
    public static void main(String[] args) {
        int batasAwal = 1;
        int batasAkhir = 20;

        System.out.println("Bilangan prima antara " + batasAwal + " dan " + batasAkhir + " adalah:");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (cekPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean cekPrima(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
