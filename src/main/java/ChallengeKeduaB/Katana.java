package ChallengeKeduaB;

public class Katana extends Mobil{
    private boolean Offroad;

    public Katana(boolean Offroad) {
        super(45, "manual");
        this.Offroad = Offroad;
    }

    @Override
    public void gerak(double kecepatan) {
        System.out.println("Suzuki Katana " + Offroad + " dengan kecepatan " + kecepatan + " km/h");
    }
}
