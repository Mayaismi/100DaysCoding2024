import java.util.Scanner;

                 //input dari keyboard
public class Day034 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        System.out.print("masukkan nama : ");
        String nama = sc.next();
        System.out.print("Masukkan nim : ");
        String nim = sc.next();
        System.out.print("masukkan umur : ");
        int umur = sc.nextInt();
        System.out.print("masukkan alamat : ");
        String alamat = sc.next();
        System.out.print("masukkan kelas : ");
        char kelas = sc.next().charAt(0);
        System.out.print("masukkan bb : ");
        double bb = sc.nextDouble();
        System.out.print("masukkan tb : ");
        double tb = sc.nextFloat();
        System.out.println("masukkan pesan dan kesan : ");
        String pk = sc.next();
   
    System.out.println("Nama  : " + nama );
    System.out.println("NIM  : " + nim );
    System.out.println("Umur  : " + umur );
    System.out.println("Alamat : " + alamat );
    System.out.println("Kelas : " + kelas );
    System.out.println("Berat Badan : " + bb  );
    System.out.println("Tinggi badan : " + tb  );
    System.out.println("pesan dan kesan : " + pk );
       
        
        
    }
    
}
