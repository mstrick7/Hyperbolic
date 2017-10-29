public class hyperbolic {

    public static double Sinh(double number) {
        return (Math.exp(number) - Math.exp(-number)) / 2;
    }

    public static double Cosh(double number) {
        return (Math.exp(number) + Math.exp(-number)) / 2;
    }

    public static double Tanh(double number) {
        return ((Math.exp(number) - Math.exp(-number)) / (Math.exp(number) + Math.exp(-number)));
    }

    public static double Coth(double number) {
        if (number == 0.0) throw new ArithmeticException("error: division by zero attempted");
        return ((Math.exp(number) + Math.exp(-number)) / (Math.exp(number) - Math.exp(-number)));
    }

    public static double Sech(double number) {
        return (2 / (Math.exp(number) + Math.exp(number)));
    }

    public static double Csch(double number) {
        return (2 / (Math.exp(number) - Math.exp(number)));
    }
}
