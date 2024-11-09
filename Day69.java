import java.util.Scanner;


public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //soal1
        char batas = sc.next().charAt(0);
        char hapus = sc.next().charAt(0);
        
        for (char i='A'; i<batas; i++){
         if (i==hapus)  {
             continue;
         } 
             System.out.print(i);
        }
        //soal4
        int genap = 0;
        int ganjil= 0;
        int awal = sc.nextInt();
        int akhir = sc.nextInt();
        
        for (int a=awal; a<=akhir; a++){
        
            
          if (a%2==0)  {
              genap++;
          }
          else{
              ganjil++;
          }
             
          }
        
           System.out.println("jumlah bilangan genap: "+genap );
            System.out.println("jumlah bilangan ganjil: "+ganjil); 
         //soal5   
        int jumlah = 0;
        int total = 0;
        while (true) {
            System.out.print("masukkan nilai : ");
            int a = sc.nextInt();
            total += a;
            if (a > 0) {
                jumlah++;

            }

            if (a < 0) {
                break;
            }

        }
        System.out.println(total);
        int rata = total/jumlah;
        System.out.println(rata);
    }
    
}
