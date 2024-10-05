import java.util.Scanner;

                 //input dari keyboard
public class Day034 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Masukkan nama: ");
    String nama = sc.nextLine();
    System.out.println("Masukkan umur anda");
    int umur = sc.nextInt();
    System.out.println("Masukkan kelas anda");   
    char kelas = sc.next().charAt(0);
    System.out.println("Masukkan status anda");
    boolean status = sc.nextBoolean();
    
    System.out.println("Nama  : " + nama );
    System.out.println("Umur  : " + umur );
    System.out.println("Kelas : " + kelas );
    System.out.println("Status: " + status );
       
        
        
    }
    
}
