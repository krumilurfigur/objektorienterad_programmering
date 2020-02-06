public class komplex {
    private double a;
    private double b;

    public komplex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return a + " + " + b + "i";
    }

    public static void main(String[] args) {
        komplex a = new komplex(3, 2);
        komplex b = new komplex(4, 1);
        komplex c = add(a,b);
        System.out.println(c);
        komplex d = multiply(a,b);
    }

    private static komplex add(komplex a, komplex b) {
        komplex c = new komplex(a.a + b.a, a.b + b.b);
        return c;
    }

    private static komplex multiply(komplex a, komplex b) {

        return null;
    }

}