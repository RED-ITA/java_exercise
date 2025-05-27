class UsePoint3d
{
    public static void main(String[] args) {

        Point3d punto1 = new Point3d();
        Point3d punto2 = new Point3d();

        punto1.build(10.4, 12.4, 300.5);
        punto2.build(123.6, 432.9, 20.45);

        if (punto1.sopraA(punto2))
        {
            System.out.println("Il punto 1 si trova sopra");
        }
        else
        {
            System.out.println("Il punto 2 si trova sopra");
        }

        punto1.stampa();
        punto2.stampa();
    }

}