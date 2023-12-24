package Practicas.P5E2;

import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		// Actividad 1

		int a[][][] = ArraysM.Array3D(2);
		int b[][][] = ArraysM.Array3D(2, 3);
		int c[][][] = ArraysM.Array3D(2, 3, 4);

		// Comando para ver la estructura creada

		System.out.println("------------------------");
		System.out.println(Arrays.deepToString(a));
		System.out.println("------------------------");
		System.out.println(Arrays.deepToString(b));
		System.out.println("------------------------");
		System.out.println(Arrays.deepToString(c));
		System.out.println("------------------------");

		// Actividad 2: Tuplas

		Edificio ed1 = new Edificio();
		ed1.setCalle("Alfonso el Magnánimo");
		ed1.setNum(11);
		ed1.setNumVecinos(24);
		System.out.println("El edificio de la calle " + ed1.getCalle() + " num " +
				ed1.getNum() + " tiene " + ed1.getNumVecinos() + " vecinos");

		// Arrays de Tuplas. Llame al array Ed[]. Inserta aquí código actividad 2

		// Creacion de la array de edificios
		Edificio[] Ed = new Edificio[3];

		// Inicializacion de cada edificio de forma individual ya que en la intrucción
		// anterior unicamente emos creado el array
		for (int i = 0; i < Ed.length; i++) {
			Ed[i] = new Edificio();
		}

		Ed[0].setCalle("Alfonso el Magnánimo");
		Ed[1].setCalle(Ed[0].getCalle());
		Ed[2].setCalle("Perú");
		Ed[0].setNum(11);
		Ed[1].setNum(13);
		Ed[2].setNum(2);
		Ed[0].setNumVecinos(24);
		Ed[1].setNumVecinos(20);
		Ed[2].setNumVecinos(6);
		for (int i = 0; i < Ed.length; i++) {
			System.out.println("El edificio de la calle " + Ed[i].getCalle() + " num " +
					Ed[i].getNum() + " tiene " + Ed[i].getNumVecinos() + " vecinos");
		}

	}
}
