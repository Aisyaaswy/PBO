package Minggu_1.TugasPraktikum;

public class Gitar {
    private String merk;
    private String warna;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void cetakInformasi() {
        System.out.println("--- Informasi Gitar ---");
        System.out.println("Merk \t \t: " + this.merk);
        System.out.println("Warna Gitar \t: " + this.warna);
    }
}
