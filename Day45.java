public class Day45 {
    public static void main(String[] args) {
        System.out.println("operator: OR");
        
        int x,y;
        x = 40;
        y = 20;
        
        System.out.println(x<y || y>x);//false
        System.out.println(x<y || x>y);//true
        System.out.println(x>=y || x<=y);//true
        System.out.println(x<=y || x>=y);//true
        
        /*Operator logika OR adalah operator yang membandingkan dua nilai yaitu true dan false,
        operator ini akan bernilai false/salah jika kedua nilai bernilai false
        */
    }
}
