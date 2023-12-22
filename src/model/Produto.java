package model;

public abstract class Produto {
	private String nome;
	private Double preco;
	private String descricao;
	private Double estoque;
	private String fabricante;
	
public Produto() {
		
	}

public Produto(String nome, Double preco, String descricao, Double estoque, String fabricante) {
	super();
	this.nome = nome;
	this.preco = preco;
	this.descricao = descricao;
	this.estoque = estoque;
	this.fabricante = fabricante;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Double getPreco() {
	return preco;
}

public void setPreco(Double preco) {
	this.preco = preco;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public Double getEstoque() {
	return estoque;
}

public void setEstoque(Double estoque) {
	this.estoque = estoque;
}

public String getFabricante() {
	return fabricante;
}

public void setFabricante(String fabricante) {
	this.fabricante = fabricante;
	}

public abstract String getResumo();
}
