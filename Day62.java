import java.util.Scanner;


public class Day62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       int a = 0;
        boolean b = false;
        System.out.println("Masukkan angka maksimun");
        int max = sc.nextInt();
        while (!b){
        System.out.println("masukkan angka berikutnya");
        int angka = sc.nextInt();
        a+=angka;
        if (a>max){
            break;               
        }
        }
    
        System.out.println(a); 
        
        int batas = 0;
        boolean maya = false;
        System.out.println("masukkan angka maksimun");
        int Max = sc.nextInt();
        while (!maya){
        System.out.println("masukkan angka Berikutnya");
        int angka1 = sc.nextInt();
        batas+=angka1;
        if(batas>Max){
            break;
        }
        }      
        System.out.println(batas);
    }
    
}
