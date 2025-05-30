class Calculator {

    int nOpDone;
    double lastRes;

    void build() {
        this.nOpDone = 0;
        this.lastRes = 0;

    }

    /*
     * BETTER WAY 
     * 
     * private void opDone(double result) {
     *    this.nOpDone++;
     *    this.lastRes = result;
     *}
     *
     *public addBest(double v1, double v2) {
     *    this.opDone(v1+v2);
     *    return v1+v2;
     *}
     *
     *public subBest(double v1, double v2) {
     *    this.opDone(v1-v2);
     *    return v1-v2;
     *}
     * 
     */
    


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
