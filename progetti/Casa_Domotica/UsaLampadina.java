class UsaLampadina {

/*
OUTPUT: 
       
-----------------------------------------------------------
INDICIZZO 3 LAMPADINE
-----------------------------------------------------------
-----------------------------------------------------------


-----------------------------------------------------------
VALORI DI DEFUALT
-----------------------------------------------------------
|  Acceso: false  |  Intensità: 0%
|  Acceso: false  |  Intensità: 0%
|  Acceso: false  |  Intensità: 0%
-----------------------------------------------------------


-----------------------------------------------------------
ACCENDO LAMPADA 1 e LAMPADA 2
-----------------------------------------------------------
|  Acceso: true  |  Intensità: 80%
|  Acceso: true  |  Intensità: 80%
|  Acceso: false  |  Intensità: 0%
-----------------------------------------------------------


-----------------------------------------------------------
DECREMENTO LAMPADINA 3
-----------------------------------------------------------
|  Acceso: true  |  Intensità: 80%
|  Acceso: true  |  Intensità: 80%
|  Acceso: true  |  Intensità: 10%
-----------------------------------------------------------


-----------------------------------------------------------
DECREMENTO LAMPADINA 1,2 e 3
-----------------------------------------------------------
|  Acceso: true  |  Intensità: 70%
|  Acceso: true  |  Intensità: 70%
|  Acceso: false  |  Intensità: 0%
-----------------------------------------------------------

*/


    public static void main(String[] args) {

        System.out.println("-----------------------------------------------------------");
        System.out.println("INDICIZZO 3 LAMPADINE");
        System.out.println("-----------------------------------------------------------");
        Lampadina bulb1 = new Lampadina();
        Lampadina bulb2 = new Lampadina();
        Lampadina bulb3 = new Lampadina();
        System.out.println("-----------------------------------------------------------\n\n");

        System.out.println("-----------------------------------------------------------");
        System.out.println("VALORI DI DEFUALT");
        System.out.println("-----------------------------------------------------------");
        System.out.println(bulb1);
        System.out.println(bulb2);
        System.out.println(bulb3);
        System.out.println("-----------------------------------------------------------\n\n");


        System.out.println("-----------------------------------------------------------");
        System.out.println("ACCENDO LAMPADA 1 e LAMPADA 2");
        System.out.println("-----------------------------------------------------------");
        bulb1.switchState();
        bulb2.switchState();
        System.out.println(bulb1);
        System.out.println(bulb2);
        System.out.println(bulb3);
        System.out.println("-----------------------------------------------------------\n\n");


        System.out.println("-----------------------------------------------------------");
        System.out.println("DECREMENTO LAMPADINA 3");
        System.out.println("-----------------------------------------------------------");
        bulb3.plusBrightness();
        System.out.println(bulb1);
        System.out.println(bulb2);
        System.out.println(bulb3);
        System.out.println("-----------------------------------------------------------\n\n");

        System.out.println("-----------------------------------------------------------");
        System.out.println("DECREMENTO LAMPADINA 1,2 e 3");
        System.out.println("-----------------------------------------------------------");
        bulb1.minusBrightness();
        bulb2.minusBrightness();
        bulb3.minusBrightness();
        System.out.println(bulb1);
        System.out.println(bulb2);
        System.out.println(bulb3);
        System.out.println("-----------------------------------------------------------\n\n");
        


    }
}