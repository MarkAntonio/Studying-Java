package br.com.abc.introducao.arrays;

public class Arrays5 {
	public static void main(String[] args) {
//		int[] [] dias = new int[3][];
//		dias[0] = new int[2];
//		dias[1] = new int[] {1, 2, 3};
//		dias[2] = new int []{1, 2, 3, 4, 5};

		int[][] dias = { { 0, 0 }, { 1, 2, 3 }, { 1, 2, 3, 4, 5 } };

		for (int[] array : dias) {
			for (int dia : array) {
				System.out.println(dia);
			}
		}
	}
}
