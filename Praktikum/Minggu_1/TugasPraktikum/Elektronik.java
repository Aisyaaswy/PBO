package Minggu_1.TugasPraktikum;

public class Elektronik {
    private String merk;
    private int daya; // Satuan dalam Watt

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setDaya(int daya) {
        this.daya = daya;
    }

    public void cetakInformasi() {
        System.out.println("Merek\t\t: " + this.merk);
        System.out.println("Kebutuhan Daya\t: " + this.daya + " Watt");
    }
}
