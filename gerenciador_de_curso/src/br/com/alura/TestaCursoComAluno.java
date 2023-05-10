package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TestaCursoComAluno {
	
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList",21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList",21));
		javaColecoes.adiciona(new Aula("Criando uma Aula",20));
		javaColecoes.adiciona(new Aula("Modelando com coleções",21));
		
		
		Aluno a1 = new Aluno ("Arthur Nunes ",2201056);
		Aluno a2 = new Aluno ("Ana Luiza",2200133);
		Aluno a3 = new Aluno ("Caiao",2244533);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		System.out.println(alunos);
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a->{
			System.out.println(a);
		});
		
		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);
		System.out.println(alunosSincronizados);
		
	}

}
