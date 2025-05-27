class TestStudent {

    public static void main(String[] args) {
        
        Student pers1 = new Student();
        Student pers2 = new Student();
        Student pers3 = new Student();
        
        pers1.build("Alex", "Balducci", 1015, 2019);
        pers2.build("Angel", "Bianchi", 1016, 2018);
        pers3.build("Andrea", "Bracci", 1017, 2017);

        pers1.printStudentInfo();
        pers2.printStudentInfo();
        pers3.printStudentInfo();

        
    }
}
