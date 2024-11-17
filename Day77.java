import java.util.Scanner;


public class Day77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("nama saya");
        String nama = sc.nextLine();
        
        String a = nama.equals("maya")? "iya" : "nd";
        System.out.println("oh jadi ini namamu " + nama + "?" +a);
        
    }
  
}
