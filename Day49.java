import java.util.Scanner;


public class Day49 {
    public static void main(String[] args) {
        //percabangan: if-else_else
        Scanner maya = new Scanner (System.in);
        System.out.println("Masukkan angka");
        int a = maya.nextInt();
        
        if (a==50||a>=10){
            System.out.println("Y");
        }
        else if (a<=70&&a<=10){
            System.out.println("G");
    }
        else{
            System.out.println("Oh");
        }
    }
    
}
