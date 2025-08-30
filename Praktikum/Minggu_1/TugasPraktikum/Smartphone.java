package Minggu_1.TugasPraktikum;

public class Smartphone extends Elektronik{
    private int kapasitasBaterai; // dalam mAh
    private int resolusiKamera;   // dalam MP (MegaPixel)

    public void setKapasitasBaterai(int kapasitas) {
        this.kapasitasBaterai = kapasitas;
    }

    public void setResolusiKamera(int resolusi) {
        this.resolusiKamera = resolusi;
    }

    public void cetakInformasi() {
        System.out.println("--- Informasi Smartphone ---");
        super.cetakInformasi();
        System.out.println("Kapasitas Baterai : " + this.kapasitasBaterai + " mAh");
        System.out.println("Resolusi Kamera : " + this.resolusiKamera + " MP");
    }
}
