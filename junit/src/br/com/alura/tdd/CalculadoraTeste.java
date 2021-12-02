package br.com.alura.tdd;

public class CalculadoraTeste {
	
	public static void main(String[] args) {
		
		Calculadora cal = new Calculadora();
		
		int soma = cal.somar(3, 7);
		System.out.println(soma);
		
		soma = cal.somar(3, 0);
		System.out.println(soma);
		
		soma = cal.somar(0, 0);
		System.out.println(soma);
		
		soma = cal.somar(2, -3);
		System.out.println(soma);
		
	}

}
