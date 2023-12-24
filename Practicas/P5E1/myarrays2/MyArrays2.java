package Practicas.P5E1.myarrays2;

public class MyArrays2 {
    public static int sumElemntsOfArray(int[] v) {
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }
        return sum;
    }

    public static long sumElemntsOfArray(long[] v) {
        long sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }
        return sum;
    }

    public static float sumElemntsOfArray(float[] v) {
        float sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }
        return sum;
    }

    public static double sumElemntsOfArray(double[] v) {
        double sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }
        return sum;
    }

    // --------------------------

    public static int sumElemntsOfArrayRec(int[] v, int sum, int pos) {
        if (pos == v.length - 1) {
            return sum + v[pos];
        }
        return sumElemntsOfArrayRec(v, sum + v[pos], pos + 1);
    }

    public static long sumElemntsOfArrayRec(long[] v, long sum, int pos) {
        if (pos == v.length - 1) {
            return sum + v[pos];
        }
        return sumElemntsOfArrayRec(v, sum + v[pos], pos + 1);
    }

    public static float sumElemntsOfArrayRec(float[] v, float sum, int pos) {
        if (pos == v.length - 1) {
            return sum + v[pos];
        }
        return sumElemntsOfArrayRec(v, sum + v[pos], pos + 1);
    }

    public static double sumElemntsOfArrayRec(double[] v, double sum, int pos) {
        if (pos == v.length - 1) {
            return sum + v[pos];
        }
        return sumElemntsOfArrayRec(v, sum + v[pos], pos + 1);
    }

    // ------------------------------------

    public static int foundElement(int[] v, int f) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == f) {
                return i;
            }
        }
        return -1;
    }

    public static int foundElement(int[] v, int f, int pos) {
        for (int i = pos; i < v.length; i++) {
            if (v[i] == f) {
                return i;
            }
        }
        return -1;
    }

    public static int foundElement(long[] v, long f) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == f) {
                return i;
            }
        }
        return -1;
    }

    public static int foundElement(long[] v, long f, int pos) {
        for (int i = pos; i < v.length; i++) {
            if (v[i] == f) {
                return i;
            }
        }
        return -1;
    }

    public static int foundElement(float[] v, float f) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == f) {
                return i;
            }
        }
        return -1;
    }

    public static int foundElement(float[] v, float f, int pos) {
        for (int i = pos; i < v.length; i++) {
            if (v[i] == f) {
                return i;
            }
        }
        return -1;
    }

    public static int foundElement(double[] v, double f) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == f) {
                return i;
            }
        }
        return -1;
    }

    public static int foundElement(double[] v, double f, int pos) {
        for (int i = pos; i < v.length; i++) {
            if (v[i] == f) {
                return i;
            }
        }
        return -1;
    }

    public static int foundElement(String[] v, String f) {
        for (int i = 0; i < v.length; i++) {
            if (v[i].equals(f)) {
                return i;
            }
        }
        return -1;
    }

    public static int foundElement(String[] v, String f, int pos) {
        for (int i = pos; i < v.length; i++) {
            if (v[i].equals(f)) {
                return i;
            }
        }
        return -1;
    }

    public static int foundElement(char[] v, char f) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == f) {
                return i;
            }
        }
        return -1;
    }

    public static int foundElement(char[] v, char f, int pos) {
        for (int i = pos; i < v.length; i++) {
            if (v[i] == f) {
                return i;
            }
        }
        return -1;
    }

    // ----------------------------------
    public static int foundElementR(int[] v, int f, int pos) {
        if (pos == v.length) {
            return -1;
        }
        if (v[pos] == f) {
            return pos;
        }
        return foundElementR(v, f, pos + 1);
    }

    public static int foundElementR(long[] v, long f, int pos) {
        if (pos == v.length) {
            return -1;
        }
        if (v[pos] == f) {
            return pos;
        }
        return foundElementR(v, f, pos + 1);
    }

    public static int foundElementR(float[] v, float f, int pos) {
        if (pos == v.length) {
            return -1;
        }
        if (v[pos] == f) {
            return pos;
        }
        return foundElementR(v, f, pos + 1);
    }

    public static int foundElementR(double[] v, double f, int pos) {
        if (pos == v.length) {
            return -1;
        }
        if (v[pos] == f) {
            return pos;
        }
        return foundElementR(v, f, pos + 1);
    }

    public static int foundElementR(char[] v, char f, int pos) {
        if (pos == v.length) {
            return -1;
        }
        if (v[pos] == f) {
            return pos;
        }
        return foundElementR(v, f, pos + 1);
    }

    public static int foundElementR(String[] v, String f, int pos) {
        if (pos == v.length) {
            return -1;
        }
        if (v[pos].equals(f)) {
            return pos;
        }
        return foundElementR(v, f, pos + 1);
    }

    // -----------------------------------

    public static int[] foundElement2D(int[][] v, int f) {
        int[] positions = new int[2];
        int[] notFound = { -1, -1 };
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (v[i][j] == f) {
                    positions[0] = i;
                    positions[1] = j;
                    return positions;
                }
            }
        }
        return notFound;
    }

}
