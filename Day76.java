//String Method : toUpperCase
public class Day76 {
    public static void main(String[] args) {
        String nama = "myaa";
        for (int a = 1; a <= 2; a++) {
            if (nama.length() > 3) {
                System.out.println(nama.toUpperCase());  
            } else {
                System.out.println("Nama terlalu pendek.");  
            }
        }       
    }
}
