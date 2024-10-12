import java.math.BigInteger;
import java.util.Scanner;


public class Day41 {
    public static void main(String[] args) {
        
        int a = 20;
        int b = 2;
        int c = a * b;
        a = c * c * c;
       // System.out.println(a = a);
        System.out.println("a: " + (a));
        
        BigInteger h = new BigInteger ("10");
        BigInteger p = new BigInteger ("14");
        
        BigInteger tambah = h.add(p);
        BigInteger kurang = h.subtract(p);
        BigInteger kali = h.multiply(p);
        BigInteger bagi = h.divide(p);
        BigInteger modulo = h.mod(p);
        
        System.out.println("tambah");
        System.out.println("kurang");
        System.out.println("kali");
        System.out.println("bagi");
        System.out.println("modulo");
        
        Scanner maya = new Scanner (System.in);
        System.out.println("Masukkan Panjang: ");
        double P = maya.nextDouble();
        System.out.println("Masukkan lebar: ");
        double L = maya.nextDouble();
        
        System.out.println(P*L);
        System.out.println(2 *(P*L));
        
      
        
        
        
    }        
    }
    

