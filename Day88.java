import java.util.Scanner;

public class Day88 {
    public static void main(String[] args) {
        Scanner maya = new Scanner(System.in);
        System.out.print("Masukkan nama file: ");
        String namaFile = maya.nextLine();
        
        int posisiTitik = -1;
        for (int i = 0; i < namaFile.length(); i++) {
            if (namaFile.charAt(i) == '.') {
                posisiTitik = i;
            }
        }

        if (posisiTitik != -1 && posisiTitik < namaFile.length() - 1) {
            String ekstensi = "";
            for (int i = posisiTitik + 1; i < namaFile.length(); i++) {
                ekstensi += namaFile.charAt(i);
            }
            System.out.println("Format file adalah: " + ekstensi);
        } else {
            System.out.println("Nama file tidak memiliki ekstensi.");
        }

        maya.close();
    }
}
