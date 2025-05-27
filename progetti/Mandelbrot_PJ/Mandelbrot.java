import java.util.concurrent.CompletionService;

public class Mandelbrot {
    static final double MAX_PRODUCT = 4.0;

    int widht;
    int height;

    int x;
    int y;

    double minx;
    double miny;
    double maxx;
    double maxy;

    double maxIter;

    //costruttore
    Mandelbrot(int widht, int height, double minx, double maxx, double miny, double maxy, double maxIter) {
        this.widht =  widht;
        this.height =  height;
        this.minx =  minx;
        this.miny =  miny;
        this.maxx =  maxx;
        this.maxy =  maxy;
        this.maxIter =  maxIter;

    }

    //metodo avanza la posizone
    void advancePosition() { //non restituisce nulla e non chide nulla (serve quindi alla dinamenica dell'oggetto stesso)
        x = (x + 1) % widht;
        y = y + (x == 0 ? 1 : 0);
    }

    //metodo per sapere se si ha finito di calcolare tutta il frattale
    boolean isCompleted() { //restitusice true o false (grazie al cazzo direi)
        return y == height;
    } 
    
    //metodo per compiere un iterazione del frattale stesso 
    int computeIterations() { //restituisce il numero di iterazioni che ha eseguito 
        Complex c0 = new Complex(this.minx + (this.maxx - this.minx) * this.x / this.widht, 
                                 this.miny + (this.maxy - this.miny) * this.y / this.height);

        Complex c = c0;
        int iter;

        for(iter = 0; c.GetScalarProduct() < MAX_PRODUCT && iter < this.maxIter; iter++) {
            c = c.times(c).sum(c0); //c = c*c+c0
        }

        return iter;
    }
}
