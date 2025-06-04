class TestCalculator {
  public static void main(String[] args) {

    /*
     * 4. Si verifichi il funzionamento della nuova calcolatrice modificando `QUESTO FILE` in modo che stampi il valore dei due nuovi campi dopo ogni operazione.
     */
	  
      Calculator calc = new Calculator(); //creiamo un istanza della classe
      calc.build(); //è un metodo che indicizza a zero i campi dell' istanza

      Calculator calc2 = new Calculator();
      calc2.build(); 

      /*
       * calc.lastRes = 0, calc.nOpDone = 0;
       * calc2.lastRes = 0, calc2.nOpDone = 0;
       */

      System.out.println("\n1 + 2 =" + calc.add(1, 2)); //eseguo un operazione di somma nella prima istanza 
      /*
       * COSA MI ASPETTO?
       * calc.lastRes = 3.0, calc.nOpDone = 1;
       * calc2.lastRes = 0, calc2.nOpDone = 0;
       */

      //Come verifico che si comporti così? 
      System.out.println("numero di operazione: " + calc.nOpDone + " ,ultimo risultato in memoria: " + calc.lastRes);
      System.out.println("numero di operazione di calc2: " + calc2.nOpDone + " ,ultimo risultato in memoria di calc2: " + calc2.lastRes);


      System.out.println("\n-1 - 2 =" + calc.sub(-1, 2)); //eseguo l'operazione di sottrazione nella prima istanza 
      /*
       * COSA MI ASPETTO?
       * calc.lastRes = -3.0, calc.nOpDone = 2;
       * calc2.lastRes = 0, calc2.nOpDone = 0;
       */

      //Come verifico che si comporti così? 
      System.out.println("numero di operazione: " + calc.nOpDone + " ,ultimo risultato in memoria: " + calc.lastRes);
      System.out.println("numero di operazione di calc2: " + calc2.nOpDone + " ,ultimo risultato in memoria di calc2: " + calc2.lastRes);


      System.out.println("\n6 * 3 =" + calc.mul(6, 3)); //eseguo l'operazione di moltiplicazione 
      /*
       * COSA MI ASPETTO?
       * calc.lastRes = 18.0, calc.nOpDone = 3;
       * calc2.lastRes = 0, calc2.nOpDone = 0;
       */

      //Come verifico che si comporti così? 
      System.out.println("numero di operazione: " + calc.nOpDone + " ,ultimo risultato in memoria: " + calc.lastRes);
      System.out.println("numero di operazione di calc2: " + calc2.nOpDone + " ,ultimo risultato in memoria di calc2: " + calc2.lastRes);


      System.out.println("\n8 / 4 =" + calc.div(8, 4)); //eseguo l'operazione di divisione 
      /*
       * COSA MI ASPETTO?
       * calc.lastRes = 2.0, calc.nOpDone = 4;
       * calc2.lastRes = 0, calc2.nOpDone = 0;
       */

      //Come verifico che si comporti così? 
      System.out.println("numero di operazione: " + calc.nOpDone + " ,ultimo risultato in memoria: " + calc.lastRes);
      System.out.println("numero di operazione di calc2: " + calc2.nOpDone + " ,ultimo risultato in memoria di calc2: " + calc2.lastRes);

      System.out.println("\nEseguo Operazione su istanza 2 ora");
      System.out.println("\n8 / 3 =" + calc2.div(8, 3)); //eseguo l'operazione di divisione  su calc2
      /*
       * COSA MI ASPETTO?
       * calc.lastRes = 2.0, calc.nOpDone = 4;
       * calc2.lastRes = 2.6666666666666665, calc2.nOpDone = 1;
       */

      //Come verifico che si comporti così? 
      System.out.println("numero di operazione: " + calc.nOpDone + " ,ultimo risultato in memoria: " + calc.lastRes);
      System.out.println("numero di operazione di calc2: " + calc2.nOpDone + " ,ultimo risultato in memoria di calc2: " + calc2.lastRes);

      

      /*
       * otuput atteso
       * 1 + 2 =3.0
       * numero di operazione: 1 ,ultimo risultato in memoria: 3.0
       * numero di operazione di calc2: 0 ,ultimo risultato in memoria di calc2: 0.0
       * 
       * -1 - 2 =-3.0
       * numero di operazione: 2 ,ultimo risultato in memoria: -3.0
       * numero di operazione di calc2: 0 ,ultimo risultato in memoria di calc2: 0.0
       * 
       * 6 * 3 =18.0
       * numero di operazione: 3 ,ultimo risultato in memoria: 18.0
       * numero di operazione di calc2: 0 ,ultimo risultato in memoria di calc2: 0.0
       * 
       * 8 / 4 =2.0
       * numero di operazione: 4 ,ultimo risultato in memoria: 2.0
       * numero di operazione di calc2: 0 ,ultimo risultato in memoria di calc2: 0.0
       * 
       * Eseguo Operazione su istanza 2 ora
       * 
       * 8 / 3 =2.6666666666666665
       * numero di operazione: 4 ,ultimo risultato in memoria: 2.0
       * numero di operazione di calc2: 1 ,ultimo risultato in memoria di calc2: 2.6666666666666665
       */
  
  }
}