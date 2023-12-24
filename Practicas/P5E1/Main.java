package Practicas.P5E1;

import Practicas.P5E1.myarrays2.MyArrays2;

class Main {
  public static void main(String[] args) {

    // Actividad 1:

    int v[] = { 1, 2, 3 };
    float f[] = { 1.1f, 1.2F, 1.3f };
    double d[] = { 1.1, 1.2, 1.4555555 };
    String s[] = { "Pablo Andrés", "Bernabéu", "Soler" };
    long l[] = { 1258090909090L, 222222222222l };
    char c[] = { 'a', 250, 41, 'b' };

    // Realice las llamadas para que imprima cada uno de los arrays unidimensionles
    // (vectores) anteriores.
    MyArrays1.printVector(v);
    MyArrays1.printVector(f);
    MyArrays1.printVector(d);
    MyArrays1.printVector(s);
    MyArrays1.printVector(l);
    MyArrays1.printVector(c);

    // Defina estructuras bidimensionals de diferentes tipos de datos e imprímelas
    // llamando a printMatrix

    int vv[][] = { { 1, 2, 3 }, { 1, 2, 3, 1 }, { 1, 2, 3, 3, 4 } };
    char cc[][] = { { 'a', 217, 40, 'b' }, { 'a', 250, 41, 'b' }, { 'b', 250, 41, 'b' }, { 'c', 250, 41, 'b' } };
    MyArrays1.printMatrix(vv);
    MyArrays1.printMatrix(cc);

    // Actividad 2.

    // int[][] M = { { 1, 2 }, { 3 }, { 4, 5, 6 } };
    // System.out.println("M = ");

    // Realice aquí las llamadas a los métodos de la actividad 2

    System.out.println("----------------------");
    System.out.println(MyArrays2.sumElemntsOfArray(v));
    System.out.println(MyArrays2.sumElemntsOfArrayRec(v, 0, 0));
    System.out.println(MyArrays2.sumElemntsOfArray(f));
    System.out.println(MyArrays2.sumElemntsOfArrayRec(f, 0, 0));
    System.out.println(MyArrays2.sumElemntsOfArray(d));
    System.out.println(MyArrays2.sumElemntsOfArrayRec(d, 0, 0));
    System.out.println(MyArrays2.sumElemntsOfArray(l));
    System.out.println(MyArrays2.sumElemntsOfArrayRec(l, 0, 0));
    System.out.println("----------------------");
    System.out.println(MyArrays2.foundElement(v, 2));
    System.out.println(MyArrays2.foundElement(v, 1, 1));
    System.out.println(MyArrays2.foundElement(l, 1258090909090L));
    System.out.println(MyArrays2.foundElement(l, 1258090909090L, 0));
    System.out.println(MyArrays2.foundElement(f, 1.3f));
    System.out.println(MyArrays2.foundElement(f, 1.3f, 1));
    System.out.println("----------------------");
    System.out.println(MyArrays2.foundElementR(v, 2, 0));
    System.out.println("----------------------");
    int[] positionVV = MyArrays2.foundElement2D(vv, 4);
    int[] positionVV2 = MyArrays2.foundElement2D(vv, 7);
    MyArrays1.printVector(positionVV);
    MyArrays1.printVector(positionVV2);
  }
}
