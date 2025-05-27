public class Complex {

    double re;
    double im;

    Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    double GetScalarProduct(){
        return this.re * this.re + this.im * this.im;
    }

    Complex sum(Complex c){
        return new Complex(this.re + c.re, this.im + c.im);
    }

    Complex times(Complex c) {
        return new Complex(this.re * c.re - this.im * c.im, c.re * this.im + c.im * this.re);
    }
}


