public class Day17 {
    public static void main(String[] args) {
        
        //Mendeklarasikan variabel dengan tipe data char
        char variabel1 = 'a';
        char variabel2 = 'b';
       final char variabel3 = 'd';
        
        //Mengubah nilai variabel2
        variabel2 = 'c';
        
        //membuat nilai variabel
        char temp = variabel1;
        variabel1 = variabel2;
        variabel2 = temp;
        
        //output hasil
        System.out.println(variabel1);//autput c
        System.out.println(variabel2);//autput a
        System.out.println(variabel3);//autput d 
       
                
    }
}
