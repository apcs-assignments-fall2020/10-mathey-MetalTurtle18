public class Mathey {
    public static int max(int a, int b) {
        return Math.max(a, b);
    }
    public static double max(double a, double b) {
        return Math.max(a, b);
    }
    public static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
    public static double max(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }
    public static int min(int a, int b) {
        return Math.min(a, b);
    }
    public static double min(double a, double b) {
        return Math.min(a, b);
    }
    public static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
    public static double min(double a, double b, double c) {
        return Math.min(Math.min(a, b), c);
    }
    public static int randomInteger(int a) {
        return (int) (Math.random() * (a + 1));
    }
    public static int randomInteger(int a, int b) {
        return (int) (Math.random() * (a + 1) + b);
    }
}