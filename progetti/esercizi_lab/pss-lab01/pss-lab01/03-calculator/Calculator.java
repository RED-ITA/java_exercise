class Calculator {

    int nOpDone;
    double lastRes;

    void build() {
        this.nOpDone = 0;
        this.lastRes = 0;

    }

    double add(double v1, double v2) {
        this.nOpDone++;
        this.lastRes = v1 + v2;
        return this.lastRes;
    }

    double sub(double v1, double v2) {
        this.nOpDone++;
        this.lastRes =  v1 - v2;
        return this.lastRes;
    }

    double mul(double v1, double v2) {
        this.nOpDone++;
        this.lastRes =  v1 * v2;
        return this.lastRes;
    }

    double div(double v1, double v2) {
        this.nOpDone++;
        this.lastRes =  v1 / v2;
        return this.lastRes;
    }

}
