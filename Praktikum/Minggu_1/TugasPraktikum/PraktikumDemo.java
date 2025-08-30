package Minggu_1.TugasPraktikum;

public class PraktikumDemo {
    public static void main(String[] args) {
        
        Gitar gtr1 = new Gitar();
        gtr1.setMerk("Yamaha");
        gtr1.setWarna("Hitam");
        gtr1.cetakInformasi();
        System.out.println();

        Smartphone hp = new Smartphone();
        hp.setMerk("Samsung");
        hp.setDaya(15); // Method dari class Elektronik
        hp.setResolusiKamera(48);
        hp.setKapasitasBaterai(5000);
        hp.cetakInformasi();
        System.out.println();

        Laptop lp = new Laptop();
        lp.setMerk("Lenovo");
        lp.setDaya(90);
        lp.setProcessor("AMD Ryzen 7");
        lp.setLebarLayar(14.0);        
        lp.cetakInformasi();
        System.out.println();

        Tissue tissue = new Tissue();
        tissue.setMerk("Multi");
        tissue.setJmlLembar(200);
        tissue.cetakInformasi();
        System.out.println();
    }
}
