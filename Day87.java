import java.util.Scanner;
public class Day87 {
    public static void main(String[] args){
       
        Scanner sc = new Scanner (System.in);
        int array = sc.nextInt();
        int a [] = new int[5];
        a[0]= 6;
        a[1]= 7;
        a[2]= 8;
        a[3]= 9;
        a[4]= 10;
        
        System.out.println(a[array]);//sebelum
        
        a[4]= 15;
        System.out.println(a[array]);//sesudah
    }

    }
