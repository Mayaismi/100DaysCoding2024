public class Day97 {
    public static void main(String[] args) {
        int batasAwal = 1; 
        int batasAkhir = 20; 

        System.out.println("Bilangan prima antara " + batasAwal + " dan " + batasAkhir + " adalah:");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Fungsi untuk mengecek apakah suatu bilangan prima
    public static boolean isPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
        }
