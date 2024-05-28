package ChallengeKeduaB;

public class Mobil extends Kendaraan {
    @SuppressWarnings("unused")
    private int kapasitasbensin;
    @SuppressWarnings("unused")
    private String transmisi;

    public Mobil(int kapasitasbensin, String transmisi) {
        super(4);
        this.kapasitasbensin = kapasitasbensin;
        this.transmisi = transmisi;
    }

    public void Gigi(int gigi) {
        System.out.println("Mobil berganti ke gigi" + gigi);
    }
}
