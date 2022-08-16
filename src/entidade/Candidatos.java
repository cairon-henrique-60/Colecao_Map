package entidade;

import java.util.Objects;

public class Candidatos {
	private String nome;
	private Integer quantidadeDeVotos;
	
	public Candidatos(String nome, Integer quantidadeDeVotos) {
		this.nome = nome;
		this.quantidadeDeVotos = quantidadeDeVotos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeDeVotos() {
		return quantidadeDeVotos;
	}

	public void setQuantidadeDeVotos(Integer quantidadeDeVotos) {
		this.quantidadeDeVotos = quantidadeDeVotos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, quantidadeDeVotos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidatos other = (Candidatos) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(quantidadeDeVotos, other.quantidadeDeVotos);
	}
}
