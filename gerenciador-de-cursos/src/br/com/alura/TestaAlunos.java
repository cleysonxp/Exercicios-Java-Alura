package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
	
	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");    
        alunos.add("Nico");
        alunos.add("Nico");
        
        System.out.println(alunos.size());
        
        boolean existe = alunos.contains("Paulo");
        System.out.println(existe);
        
        System.out.println();
        
        for (String aluno : alunos) {
			System.out.println(aluno);
		}
        System.out.println();
        
        alunos.forEach(aluno ->{
        	System.out.println(aluno);
        });
        
        System.out.println();
        System.out.println(alunos);
		
	}

}
