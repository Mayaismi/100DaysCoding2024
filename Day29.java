import java.math.BigInteger;

public class Day29 {
    
//Method main
public static void main(String[] args) {

//BigInteger adalah tipe data non primitif yang dimana perkembangan dari tipe data integer yng menyimpan bilangan bulat 
//BingInteger hampir tdk dibatasi nilainya sedangkan Integer nilainya dibatasi
BigInteger a = new BigInteger ("10");
BigInteger b = new BigInteger ("20");
BigInteger c = new BigInteger ("30");

//kemudian saya jumlahkan,kurang,kali dan bagi
BigInteger jumlah = a.add (b);
BigInteger kurang = c.subtract(b);
BigInteger kali = a.multiply(c);
BigInteger bagi = b.divide(a);

//Menampilkan isi variabel
System.out.println("Penjumlahan: "+ jumlah);
System.out.println("pengurangan: "+ kurang);
System.out.println("perkalian  : "+ kali);
System.out.println("pembagian  : "+ bagi);


    }
    
}
