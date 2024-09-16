public class Day15 {
    public static void main(String[] args) {
            System.out.println("");
        //Mendeklarasikan variabel dengan tipe data double
        double nilai = 7.2836482977;
        System.out.printf("%.1f%n", nilai); //1 angka dibelakang koma
        System.out.printf("%.2f%n", nilai); // 2 amgka di belakang koma
        System.out.printf("%.3f%n", nilai); // 3 angka dibelakang koma
        System.out.printf("%.4f%n", nilai); // 4 angka dibelakang koma
        System.out.printf("%.5f%n", nilai); // 5 angka dibelakang koma
        
        System.out.println(String . format ("%.6f", nilai)); // 6 angka dibelakang koma
        System.out.println(String . format ("%.7f", nilai)); // 7 angka dibelakang koma
        System.out.println(String . format ("%.8f", nilai)); // 8 angka dibelakang koma
        System.out.println(String . format ("%.9f", nilai)); // 9 angka dibelakang koma
        System.out.println(String . format ("%.10f", nilai)); // 10 angka dibelakang koma
        
    }
}
