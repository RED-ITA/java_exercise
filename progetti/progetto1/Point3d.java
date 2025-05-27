 
class Point3d {
    double x;
    double y;
    double z;

    void build(double x, double y, double z) {
        this.x = x; 
        this.y = y;
        this.z = z;
    }

    double get_z() {
        return this.z;
    }

    boolean sopraA(Point3d p) {
        double z_appoggio = p.get_z();
        if (z_appoggio > this.z)
        {
            return false;
        }
        return true;
    }

    void stampa()
    {
        System.out.println("x: " + this.x + ", y: " + this.y + ", z: " + this.z);
    }
}


