package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do c�digo");
		palavras.add("caelum");

//		ComparadorPorTamanho comparador = new ComparadorPorTamanho();
		
//		palavras.sort(comparador);
		
//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		palavras.sort((s1, s2) -> s1.length() - s2.length());
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		
		
		System.out.println(palavras);

//		Consumer<String> consumidor = new ImprimeNaLinha();
//		palavras.forEach(consumidor);

		Consumer<String> consumidor = new Consumer<String>() {
			public void accept(String s) {
				System.out.println(s);
			}
		};
		palavras.forEach(s -> System.out.println(s));
		palavras.forEach(System.out::println);
	}
}

//class ComparadorPorTamanho implements Comparator<String> {
//
//	@Override
//	public int compare(String s1, String s2) {
//		if (s1.length() < s2.length())
//			return -1;
//		if (s1.length() > s2.length())
//			return 1;
//		return 0;
//	}
//
//}

//class ImprimeNaLinha implements Consumer<String> {
//
//	@Override
//	public void accept(String s) {
//		System.out.println(s);
//
//	}
//
//}
