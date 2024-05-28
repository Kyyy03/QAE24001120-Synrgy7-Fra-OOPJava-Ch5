package ChallengePertama;
import java.util.Scanner;

public class Parkiran {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String hitungulang;
            do {
                System.out.println("Berapa lama kamu parkir");
                int lamaparkir = scanner.nextInt();
                double bayarparkir = hitungbayar(lamaparkir);
                System.out.printf("Anda harus membayar sebesar $%.2f\n", bayarparkir);
                System.out.println("Apakah anda ingin menghitung lagi");
                hitungulang = scanner.next();
            } while (
                    hitungulang.equalsIgnoreCase("ya")
                );
                
                System.out.println("Terimakasih");
                scanner.close();
    }

    public static double hitungbayar(int jam) {
        if (jam <= 5) {
            return 1.0;
        
        } else if (jam < 24) {
            return 1.0 + 0.5 * (jam - 5);
        
        } else {
            double bayar = 15.0;
            
            if (jam > 24) {
                bayar += 0.5 * (jam - 24);
            }
            
            return bayar;

        }
    }
}