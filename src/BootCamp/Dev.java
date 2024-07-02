package BootCamp;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConlcuidos = new LinkedHashSet<>();
	
	public void inscreverBootcamp (Bootcamp bootcamp) {
		
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
		
	}
	
	public void progredir() {
		
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if (conteudo.isPresent()) {
			this.conteudosConlcuidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		}
		else {
			System.err.println("Você não esta matriculado em nenhum conteudo");
		}
	}
	
	public double calcularTotalXp() {
		
		return this.conteudosConlcuidos.stream().mapToDouble(Conteudo::calcularXP).sum();
		
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConlcuidos() {
		return conteudosConlcuidos;
	}

	public void setConteudosConlcuidos(Set<Conteudo> conteudosConlcuidos) {
		this.conteudosConlcuidos = conteudosConlcuidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConlcuidos, conteudosInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConlcuidos, other.conteudosConlcuidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}
	
	
	
	

}
