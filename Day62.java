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
        
        
    }
    }
    

