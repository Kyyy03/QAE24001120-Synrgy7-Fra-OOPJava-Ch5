package ChallengeKeduaB;

public class Jazz extends Mobil {
    private String varian;

    public Jazz(String varian) {
        super(40, "automatic");
        this.varian = varian;
    }

    @Override
    public void gerak(double kecepatan) {
        System.out.println("Honda Jazz " + varian + " bergerak dengan " + kecepatan + " km/h");
    }
}
