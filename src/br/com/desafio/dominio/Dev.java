package br.com.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
	private String nome;
	Set<Conteudo> conteudoInscrito = new LinkedHashSet<Conteudo>();
	Set<Conteudo> conteudoConcluido = new LinkedHashSet<Conteudo>();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudoInscrito() {
		return conteudoInscrito;
	}

	public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
		this.conteudoInscrito = conteudoInscrito;
	}

	public Set<Conteudo> getConteudoConcluido() {
		return conteudoConcluido;
	}

	public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
		this.conteudoConcluido = conteudoConcluido;
	}

	public void inscreverBootCamp(BootCamp bootCamp) {
		
	}
	
	public void progredir() {
		
	}
		
	public void calcularTotalXp() {
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudoConcluido, conteudoInscrito, nome);
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
		return Objects.equals(conteudoConcluido, other.conteudoConcluido)
				&& Objects.equals(conteudoInscrito, other.conteudoInscrito) && Objects.equals(nome, other.nome);
	}	

}
