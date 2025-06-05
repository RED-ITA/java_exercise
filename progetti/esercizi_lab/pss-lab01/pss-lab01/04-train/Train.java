public class Train {

    // campi della classe
    int nTotSeats; // Numero dei posti totali del treno
    int nFirstClassSeats; // Numero dei posti in prima classe
    int nSecondClassSeats; // Numero dei posti in seconda classe
    int nFirstClassReservedSeats; // Numero dei posti in prima classe già prenotati
    int nSecondClassReservedSeats; // Numero dei posti in seconda classe già prenotati

    // metodo build
    void build(int nFirstClassSeats, int nSecondClassSeats) {
        /*
         * inizializzare opportunamente i campi. Si valuti quale sia un set di argomenti
         * di
         * input corretto e più piccolo possibile per il metodo suddetto
         */
        this.nTotSeats = nFirstClassSeats + nSecondClassSeats;
        this.nFirstClassSeats = nFirstClassSeats;
        this.nSecondClassSeats = nSecondClassSeats;
        this.nFirstClassReservedSeats = 0; // indicizzato a zero all'inzio
        this.nSecondClassReservedSeats = 0; // indicizzato a zero all'inizio
    }


    // metodi
    void reserveFirstClassSeats(int numPosti) {
        //consente di riservare dei posti in prima classe
        if(numPosti <= (this.nFirstClassSeats - this.nFirstClassReservedSeats)) {
            this.nFirstClassReservedSeats += numPosti;
            System.out.println("La prenotazione è andata a buon fine.");
        }
        else {
            System.out.print("Impossibile prenotare, seleziona massimo ");
            System.out.println((this.nFirstClassSeats-this.nFirstClassReservedSeats) + " posti");
        }
    }

    void reserveSecondClassSeats(int numPosti) {
        //consente di riservare dei posti in seconda classe
        if(numPosti <= (this.nSecondClassSeats - this.nSecondClassReservedSeats)) {
            this.nSecondClassReservedSeats += numPosti;
            System.out.println("La prenotazione è andata a buon fine.");
        }
        else {
            System.out.print("Impossibile prenotare, seleziona massimo ");
            System.out.println((this.nSecondClassSeats-this.nSecondClassReservedSeats) + " posti");
        }
    }

    double getTotOccupancyRatio() {
        int totOccupancy;
        double percentuale;
        totOccupancy = this.nFirstClassReservedSeats + this.nSecondClassReservedSeats;
        percentuale = (double) totOccupancy * 100.0f  / this.nTotSeats;
        return percentuale;
    }

    double getFirstClassOccupancyRatio() {
        double percentuale;
        percentuale = (double) this.nFirstClassReservedSeats * 100.0f  / this.nFirstClassSeats;
        return percentuale;
    }

    double getSecondClassOccupancyRatio() {
        double percentuale;
        percentuale = (double) this.nSecondClassReservedSeats * 100.0f / this.nSecondClassSeats;
        return percentuale;
    }

    void deleteAllReservations() {
        this.nFirstClassReservedSeats = 0; // indicizzato a zero all'inzio
        this.nSecondClassReservedSeats = 0; // indicizzato a zero all'inizio
    }

}
