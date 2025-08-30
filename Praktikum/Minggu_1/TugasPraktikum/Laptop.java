package Minggu_1.TugasPraktikum;

public class Laptop extends Elektronik {
    private double lebarLayar; // dalam inci
    private String processor;

    public void setLebarLayar(double lebar) {
        this.lebarLayar = lebar;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void cetakInformasi() {
        System.out.println("--- Informasi Laptop ---");
        super.cetakInformasi();
        System.out.println("Lebar Layar \t: " + this.lebarLayar + " inci");
        System.out.println("Processor \t: " + this.processor);
    }
}
