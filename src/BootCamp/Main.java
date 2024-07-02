package BootCamp;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso curso = new Curso();
		curso.setTitulo("Curso Java");
		curso.setDescricao("descrição curso de java");
		curso.setCargaHoraria(8);
			
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria em Java");
		mentoria.setDescricao("Descrição da mentoria");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp java dev");
		bootcamp.setDescricao("Descricao bootcamp java dev");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devHenrique = new Dev();
		devHenrique.setNome("Henrique");
		devHenrique.inscreverBootcamp(bootcamp);
		devHenrique.progredir();
		System.out.println("Conteudos Inscritos Henrique " + devHenrique.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Henrique " + devHenrique.getConteudosConlcuidos());
		System.out.println("XP: " + devHenrique.calcularTotalXp());
		
		System.out.println("=======================");
		
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Camila " + devCamila.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Camila " + devCamila.getConteudosConlcuidos());
		System.out.println("XP: " + devCamila.calcularTotalXp());
		
		
	}

}
