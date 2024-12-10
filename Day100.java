import java.time.LocalTime;
import java.util.Scanner;



public class Day100 {
    public static void main(String[] args) {
        Scanner mayacan = new Scanner (System.in);
        System.out.println("Masukkan nama anda: ");
        String nama = mayacan.nextLine();
        
       LocalTime waktuSekarang = LocalTime.now();
      
       String salam;
       if(waktuSekarang.isBefore(LocalTime.NOON)){
           salam = "Selamat pagi";
       }
       if(waktuSekarang.isBefore(LocalTime.of(17, 0))){
           salam= "Selamat Siang";
       }
       else{
           salam = "Selamat Malam";
       }
        System.out.println("=======================================");
        System.out.printf("         %s, %s%n", salam,nama);  
        System.out.println("        Prongram Anda Telah Selesai");
        System.out.println("=======================================");
        

    }
}
