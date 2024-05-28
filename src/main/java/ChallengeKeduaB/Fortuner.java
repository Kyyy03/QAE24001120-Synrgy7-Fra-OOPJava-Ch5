package ChallengeKeduaB;

public class Fortuner extends Mobil{
    private boolean FWD;

    public Fortuner(boolean FWD) {
        super(70, "manual");
        this.FWD = FWD;
    }

    @Override
    public void gerak(double kecepatan) {
        System.out.println("Toyota Fortuner " + FWD + " moving at " + kecepatan + " km/h");
    }
}
