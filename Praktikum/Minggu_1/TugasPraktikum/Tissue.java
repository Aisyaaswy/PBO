package Minggu_1.TugasPraktikum;

public class Tissue {
    private String merk;
    private int jmlLembar;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setJmlLembar(int jumlah) {
        this.jmlLembar = jumlah;
    }

    public void cetakInformasi() {
        System.out.println("--- Informasi Tissue ---");
        System.out.println("Merek \t\t: " + this.merk);
        System.out.println("Jumlah Lembar \t: " + this.jmlLembar);
    
    }
}
