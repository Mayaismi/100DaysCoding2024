import java.util.Scanner;

public class Day78 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan nama1");
        String nama1 = sc.nextLine();

        System.out.println("masukkan nama2");
        String nama2 = sc.nextLine();

        if (nama1.equalsIgnoreCase(nama2)) {
            System.out.println("samaji");
        } else {
            System.out.println("tidak sama");
        }

    }
}
