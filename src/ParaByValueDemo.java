class ParaByValueDemo {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        ParaByValue test = new ParaByValue();
        test.callByVal(a, b);
        System.out.println("a = " + a); // BeBoy 2
        System.out.println("b = " +b); // BrBon 3
    }
}