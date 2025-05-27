class TestScopesMain {
    public static void main(String[] argv) {
        Scopes testObj = new Scopes();
        testObj.build(1, 2);
        /*
         * this.a = 1, this.b = 2
         * a = 1, b = 2
         */
        testObj.dummyMethod(3);
        /*
         * this.a = 1, this.b = 2
         * c = 3
         */
        testObj.dummyMethod2(4);
        /*
         * this.a = 1, this.b = 2
         * a = 4, b = 0
         */
    }
}
