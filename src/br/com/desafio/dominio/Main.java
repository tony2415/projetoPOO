package br.com.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso = new Curso("Java para vida", "Curso de Java", 50);
		Mentoria mentoria = new Mentoria("Aprenda java na prática", "java para iniciantes", LocalDate.now());
		
		BootCamp bootCamp = new BootCamp();
		bootCamp.setNome("Java do Zero a 100");
		bootCamp.setDescricao("bootcamp para iniciantes em java");
		bootCamp.getConteudo().add(mentoria);
		bootCamp.getConteudo().add(curso);
		
		Dev dev1 = new Dev();
		dev1.setNome("Antonio");
		dev1.inscreverBootCamp(bootCamp);
		
		Dev dev2 = new Dev();
		dev2.setNome("Camila");
		dev2.inscreverBootCamp(bootCamp);
		dev2.progredir();
		
		System.out.println(dev2.getConteudoInscrito());
		System.out.println(dev2.getConteudoConcluido());
		System.out.println(dev2.calcularTotalXp());
		
		dev2.progredir();
		
		System.out.println(dev2.calcularTotalXp());
		dev1.progredir();
		System.out.println(dev1.calcularTotalXp());




	}

}
