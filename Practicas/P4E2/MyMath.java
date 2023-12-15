package Practicas.P4E2;

public class MyMath {

    public static float max(float f1, float f2) {
        if (f1 > f2) {
            return f1;
        }
        return f2;
    }

    public static float max(float f1, float f2, float f3) {
        return max(max(f1, f2), f3);
    }

    public static double modulo(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static double angulo(double a, double b) {
        double ang = Math.atan(Math.abs(b) / Math.abs(a));
        if ((a <= 0) && (b >= 0)) {// segundo
            return Math.PI - ang;
        } else if ((a <= 0) && (b <= 0)) {// tercer
            return (3 * Math.PI / 2) - ang;
        } else if ((a >= 0) && (b <= 0)) {// cuarto
            return (2 * Math.PI) - ang;
        } else {// primer
            return ang;
        }
    }

}
