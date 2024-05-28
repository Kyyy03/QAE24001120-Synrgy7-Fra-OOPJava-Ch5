package ChallengeKeduaB;

public class Kendaraan {
    @SuppressWarnings("unused")
    private int ban;
    @SuppressWarnings("unused")
    private double kecepatan;

    public Kendaraan(int ban) {
        this.ban = ban;
        this.kecepatan = 0;
    }

    public void gerak(double kecepatan) {
        this.kecepatan = kecepatan;
        System.out.println("Kendaraan bergerak dengan kecepatan" + kecepatan + " km/h");
    }

    public void belok(String arah) {
        System.out.println("Kendaraan bergerak kearah :" + arah);
    }
}
