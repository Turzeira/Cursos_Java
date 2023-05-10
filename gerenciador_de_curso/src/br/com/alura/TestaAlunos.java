package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add ("Arthur Nunes");
		alunos.add ("Ana Luiza");
		alunos.add ("Rosimeire Nunes");
		alunos.add ("Agnaldo Ribeiro");
		alunos.add ("Luiza Nunes");
		alunos.add ("Arthur Nunes");
	
		boolean leoEstaMatriculado = alunos.contains("Leonardo Ginez");
		System.out.println(leoEstaMatriculado);
		
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
	
	
	
	
	}

}
