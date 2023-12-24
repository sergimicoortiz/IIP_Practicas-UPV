package Practicas.P5E2;

import java.util.Scanner;

public class ArraysM {
    public static Scanner tec = new Scanner(System.in);

    public static int[][][] Array3D(int f, int c, int p) {
        return new int[f][c][p];
    }

    public static int[][][] Array3D(int f, int c) {
        System.out.println("Introduzca la profundidad del array: ");
        int p = tec.nextInt();
        return new int[f][c][p];
    }

    public static int[][][] Array3D(int f) {
        System.out.println("Introduzca la profundidad del array: ");
        int p = tec.nextInt();
        System.out.println("Introduzca el número de columnas del array: ");
        int c = tec.nextInt();
        return new int[f][c][p];
    }
}
