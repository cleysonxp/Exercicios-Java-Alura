package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as cole??es do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole??es", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		Aluno a4 = new Aluno("Paulo Silveira", 5617);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);

		System.out.println("Todos os alunos matriculados: ");
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();

		while (iterador.hasNext()) {
		    System.out.println(iterador.next());
		}
//		javaColecoes.getAlunos().forEach(aluno -> {
//			System.out.println(aluno);
//		});
		
		System.out.println();
		System.out.println("O aluno " + a1 + " est? matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));

		System.out.println();
//		String nome = "Rodrigo Turini";
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("Esse Turini existe?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println();
		System.out.println("O a1 ? == o Turini");
		System.out.println(a1 == turini);
		
		System.out.println();
		System.out.println("o a1 ? equals ao Turini?");
		System.out.println(a1.equals(turini));
	}

}
