class UseTrain {
    public static void main(String[] args) {

        // PER 05/06/2025 finire questo esesrczio

        //DIO CANE TI MENO SE NON LO FAI

        //PRENDITI 4 ore per farlo 

        //ripeto ti meno se non lo fai 

        Train train1 = new Train();
        train1.build(10, 40);

        train1.reserveFirstClassSeats(2);
        train1.reserveSecondClassSeats(3);

        System.out.print("Percentiuale posti occupati totale: ");
        System.out.println(train1.getTotOccupancyRatio() + "%\n");
        System.out.print("Percentiuale posti occupati prima classe: ");
        System.out.println(train1.getFirstClassOccupancyRatio() + "%\n");
        System.out.print("Percentiuale posti occupati seconda classe: ");
        System.out.println(train1.getSecondClassOccupancyRatio() + "%\n");


        train1.deleteAllReservations();

        train1.reserveFirstClassSeats(6);
        train1.reserveSecondClassSeats(13);
        train1.reserveFirstClassSeats(6);
        train1.reserveSecondClassSeats(13);
        train1.reserveFirstClassSeats(6);
        train1.reserveSecondClassSeats(13);
        train1.reserveFirstClassSeats(6);
        train1.reserveSecondClassSeats(13);
        train1.reserveFirstClassSeats(6);
        train1.reserveSecondClassSeats(13);
        train1.reserveFirstClassSeats(4);
        train1.reserveSecondClassSeats(1);



        System.out.print("Percentiuale posti occupati totale: ");
        System.out.println(train1.getTotOccupancyRatio() + "%\n");
        System.out.print("Percentiuale posti occupati prima classe: ");
        System.out.println(train1.getFirstClassOccupancyRatio() + "%\n");
        System.out.print("Percentiuale posti occupati seconda classe: ");
        System.out.println(train1.getSecondClassOccupancyRatio() + "%\n");

        /*
         * Premesse per un corretto testing della classe. Per ragioni di
         * coerenza e semplicità:
         * - I vari metodi siano sempre invocati passando dei parametri di input
         * validi e consistenti (p.e. non invocare i metodi per effettuare delle
         * prenotazioni specificando un numero di posti superiore alla capienza
         * del treno, ai posti disponibili per la classe (prima/seconda)
         * considerata, al numero di posti correntemente liberi
         *
         *
         * Testing: 1) Creare un oggetto della classe Train specificando valori
         * a piacere per i parametri
         *
         * 2) Effettuare delle prenotazioni in prima e seconda classe
         * specificando un numero di posti da prenotare consistente
         *
         * 3) A seguito di ciascuna prenotazione stampare la ratio di
         * occupazione totale e per ciascuna classe.
         *
         * 4) Cancellare tutte le prenotazioni
         *
         * 5) Prenotare nuovamente dei posti e stampare le nuove percentuali di
         * occupazione
         */
    }
}
