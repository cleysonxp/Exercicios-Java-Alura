package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {

		int[] idades = new int[5];

		idades[0] = 7;
		idades[1] = 9;
		idades[2] = 19;
		idades[3] = 13;
		idades[4] = 22;

		int idade = idades[3];

		System.out.println(idade);
		System.out.println("O tamanho do array é: " + idades.length);

		int[] idades2 = new int[5];
		for (int i = 0; i < idades2.length; i++) {
			idades2[i] = i * i;
		}
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}

	}

}
