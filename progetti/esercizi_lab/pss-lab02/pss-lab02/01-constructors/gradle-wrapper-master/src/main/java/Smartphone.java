package it.unibo.constructors;

class Smartphone {

    static final boolean DEF_HAS_GPS = false;
    static final boolean DEF_HAS_3G = false;
    static final boolean DEF_HAS_NFC = false;
    static final int DEF_SD_SIZE = 8192;
    static final int DEF_RAM_SIZE = 1024;
    static final int DEF_N_CPU = 2;

    int nCPU;
    int ram;
    int sdSize;
    String brand;
    String model;
    boolean hasGPS;
    boolean has3G;
    boolean hasNFC;


    Smartphone(String brand, String model, int ram, int nCPU, int sdSize, boolean hasGPS,  boolean hasNFC, boolean has3G) {
        this.ram = ram;
        this.nCPU = nCPU;
        this.sdSize = sdSize;
        this.hasNFC = hasNFC;
        this.hasGPS = hasGPS;
        this.has3G = has3G;
        this.brand = brand;
        this.model = model;
    }

    //first constructor
    Smartphone(String brand, String model) {
        this(brand, model, DEF_RAM_SIZE, DEF_N_CPU, DEF_SD_SIZE, DEF_HAS_GPS, DEF_HAS_NFC, DEF_HAS_3G);
    }

    Smartphone(String brand, String model, boolean hasGPS, boolean has3G) {
        this(brand, model, DEF_RAM_SIZE, DEF_N_CPU, DEF_SD_SIZE, hasGPS, DEF_HAS_NFC, has3G);
    }

    Smartphone(String brand, String model, int sdSize) {
        this(brand, model, DEF_RAM_SIZE, DEF_N_CPU, sdSize, DEF_HAS_GPS, DEF_HAS_NFC, DEF_HAS_3G);
    }

    Smartphone(String brand, String model, boolean hasNFC) {
        this(brand, model, DEF_RAM_SIZE, DEF_N_CPU, DEF_SD_SIZE, DEF_HAS_GPS, hasNFC, DEF_HAS_3G);
    }

    //Creare lo Smartphone Samsung Galaxy Note 3 ram:2048 cpu:4
    //sdSize:8192 gps:true nfc:true 3g:true
   
    void printStringRep() {
        System.out.println("Smartphone info:");
        System.out.println("n CPU(s): " + this.nCPU);
        System.out.println("RAM amount: " + this.ram);
        System.out.println("SD size: " + this.sdSize);
        System.out.println("brand: " + this.brand);
        System.out.println("model: " + this.model);
        System.out.println("hasGPS: " + this.hasGPS);
        System.out.println("has3G: " + this.has3G);
        System.out.println("hasNFC: " + this.hasNFC + "\n");
    }

    public static void main(final String[] args) {
        // 1) Creare lo Smartphone HTC One sdSize:1024
        Smartphone smartphone1 = new Smartphone("HTC", "One", 1024);
        // 2) Creare lo Smartphone Samsung Galaxy Note 3 ram:2048 cpu:4
        // sdSize:8192 gps:true nfc:true 3g:true
        Smartphone smartphone2 = new Smartphone("Smasung", "Galaxy Note 3", 2048, 4, 8192, true, true, true);
        // 3) Creare lo Smartphone Apple iPhone 5S nfc:false
        Smartphone smartphone3 = new Smartphone("Apple", "iPhone 5S", false);
        // 4) Creare lo Smartphone Google Nexus 4 gps:true 3g:true
        Smartphone smartphone4 = new Smartphone("Google", "Nexus 4", true, true);
        // 5) Utilizzare il metodo printStringRep per stampare in standard
        // output le informazioni di ciascun telefono
        smartphone1.printStringRep();
        smartphone2.printStringRep();
        smartphone3.printStringRep();
        smartphone4.printStringRep();
    }
}
