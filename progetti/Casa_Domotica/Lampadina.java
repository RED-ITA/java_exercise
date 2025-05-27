public class Lampadina {

    //Costanti della classe
    private static final int LIVELLI = 100;
    private static final double DELTA = 0.01;
    private static final int DEFAULT = 80;

    //Campi della classe
    private boolean state; //stato della luce (acceso o spento)
    private int brightness; //intesità luminosa della luce


    //Costruttore unico
    public Lampadina()
    {
        //configura l' isntaza con la luce spenta e la luminosità a zero
        this.state = false; 
        this.brightness = 0;
    }

    //metodi ad uso interno
    private void valoreCorretto() {
        //riporta la luministà nei valori prestabiliti
        if (this.brightness < 0) {
            this.brightness = 0;
        }
        else if (this.brightness > LIVELLI) {
            this.brightness = LIVELLI;
        }
        this.cambia();
    }

    private void cambia() {
        //rende concorde la luminosità e lo stato se viene modificata
        if (this.brightness == 0 && this.getStato()) {
            this.switchState();
        }
        else if (this.brightness != 0 && !this.getStato()) {
            this.switchState();
        }
    }

    private void defaultValue() {
        //se è accesa e la luminosità resta a 0 la porto a 8 di default
        if(this.brightness == 0 && this.state) {
            this.brightness = DEFAULT;
        }
    }

    //Metodi 
    public void switchState() {
        //inverte lo stato della luce
        this.state = !this.state;
        this.defaultValue();
    }

    public void plusBrightness() {
        //aumenta la luminoiostà attuale della luce
        this.brightness++;
        this.valoreCorretto();
    }

    public void minusBrightness() {
        // diminuisce la luminosità attuale della luce
        this.brightness--;
        this.valoreCorretto();
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        this.valoreCorretto();
    }
    //Metodi get
    public boolean getStato() {
        return this.state;
    }

    public int getLum() {
        return (int)((double)(this.brightness * DELTA ) * 100);
    }

    public String toString() {
        return "|  Acceso: " + this.getStato() + "  |  Intensità: " + this.getLum() + "%";
    }
    
}