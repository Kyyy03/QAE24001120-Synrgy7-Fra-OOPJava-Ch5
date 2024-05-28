package ChallengeKeduaB;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Pilih mobil: 1. Honda Jazz 2. Toyota Fortuner 3. Suzuki Katana");
            int pilihan = scanner.nextInt();
            Mobil mobil = null;

            switch (pilihan) {
                case 1:
                    mobil = new Jazz("Racing");
                    break;
                case 2:
                    mobil = new Fortuner(true);
                    break;
                case 3:
                    mobil = new Katana(true);
                    break;
                default:
                    System.out.println("Pilihan Tidak ada :).");
                    continue;
            }

            if (mobil != null) {
                System.out.println("Seberapa cepat mobil mu?");
                double kecepatan = scanner.nextDouble();
                mobil.gerak(kecepatan);
            }


            System.out.println("Mau lanjut? (iya/tidak)");
            String jawaban = scanner.next();
            if (jawaban.equalsIgnoreCase("tidak")) {
                break;
            }
        }

        scanner.close();
        System.out.println("Terimakasih");
    }
}