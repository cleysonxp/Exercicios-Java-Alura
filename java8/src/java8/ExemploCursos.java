package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Curso {

	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}
}

public class ExemploCursos {
	
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		System.out.println("Ordenando a quantidade de alunos");
		cursos.sort(Comparator.comparingInt(c->c.getAlunos()));
//		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		cursos.forEach(c->System.out.println(c.getAlunos()));
		 
		System.out.println();
		System.out.println("Cursos com mais de 50 alunos!");
		cursos.stream().filter(c-> c.getAlunos() > 50).forEach(c -> System.out.println(c.getNome()));
		
		System.out.println();
		System.out.println("Ordenando cursos do menor para a maior quantidade de aluno!");
		Stream<String> nomes = cursos.stream().map(Curso::getNome);
		nomes.forEach(c-> System.out.println(c));
		
		System.out.println();
		System.out.println("Cursos com mais de 50 alunos, utilizando o method reference");
		cursos.stream().filter(c -> c.getAlunos() > 50).map(c -> c.getAlunos()).forEach(x -> System.out.println(x));
	}	
}
