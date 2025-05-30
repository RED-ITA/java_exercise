class TestCalculator {
  public static void main(String[] args) {

    /*
     * 4. Si verifichi il funzionamento della nuova calcolatrice modificando `QUESTO FILE` in modo che stampi il valore dei due nuovi campi dopo ogni operazione.
     */
	  
      Calculator calc = new Calculator();
      System.out.println("1 + 2 =" + calc.add(1, 2));
      System.out.println("-1 - 2 =" + calc.sub(-1, 2));
      System.out.println("6 * 3 =" + calc.mul(6, 3));
      System.out.println("8 / 4 =" + calc.div(8, 4));
  }
}