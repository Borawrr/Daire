import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double π = 3.14;
        int r;
        int a;

        System.out.println("Dairenizin Yarıçapını Giriniz : ");
        r = scanner.nextInt();

        System.out.println("Merkez Açısının Ölçüsünü Giriniz : ");
        a = scanner.nextInt();

        double DaireDilimiAlan = (π * (r*r) * a)/360;

        System.out.println("Daire Diliminizin Alanı : " + DaireDilimiAlan);
    
        scanner.close();
    }
}
