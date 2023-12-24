package Practicas.P5E1;

public class MyArrays1 {
    public static void printVector(int[] v) {
        String str = "[";
        for (int i = 0; i < v.length; i++) {
            if (i == v.length - 1) {
                str += v[i] + "]";
            } else {
                str += v[i] + ", ";
            }
        }
        System.out.println(str);
    }

    public static void printVector(long[] v) {
        String str = "[";
        for (int i = 0; i < v.length; i++) {
            if (i == v.length - 1) {
                str += v[i] + "]";
            } else {
                str += v[i] + ", ";
            }
        }
        System.out.println(str);
    }

    public static void printVector(float[] v) {
        String str = "[";
        for (int i = 0; i < v.length; i++) {
            if (i == v.length - 1) {
                str += v[i] + "]";
            } else {
                str += v[i] + ", ";
            }
        }
        System.out.println(str);
    }

    public static void printVector(double[] v) {
        String str = "[";
        for (int i = 0; i < v.length; i++) {
            if (i == v.length - 1) {
                str += v[i] + "]";
            } else {
                str += v[i] + ", ";
            }
        }
        System.out.println(str);
    }

    public static void printVector(String[] v) {
        String str = "[";
        for (int i = 0; i < v.length; i++) {
            if (i == v.length - 1) {
                str += v[i] + "]";
            } else {
                str += v[i] + ", ";
            }
        }
        System.out.println(str);
    }

    public static void printVector(char[] v) {
        String str = "[";
        for (int i = 0; i < v.length; i++) {
            if (i == v.length - 1) {
                str += v[i] + "]";
            } else {
                str += v[i] + ", ";
            }
        }
        System.out.println(str);
    }

    // -------------------------------------------

    public static void printMatrix(int[][] v) {
        for (int i = 0; i < v.length; i++) {
            printVector(v[i]);
        }
    }

    public static void printMatrix(long[][] v) {
        for (int i = 0; i < v.length; i++) {
            printVector(v[i]);
        }
    }

    public static void printMatrix(float[][] v) {
        for (int i = 0; i < v.length; i++) {
            printVector(v[i]);
        }
    }

    public static void printMatrix(double[][] v) {
        for (int i = 0; i < v.length; i++) {
            printVector(v[i]);
        }
    }

    public static void printMatrix(String[][] v) {
        for (int i = 0; i < v.length; i++) {
            printVector(v[i]);
        }
    }

    public static void printMatrix(char[][] v) {
        for (int i = 0; i < v.length; i++) {
            printVector(v[i]);
        }
    }
}
