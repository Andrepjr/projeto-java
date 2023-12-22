package model;

public class Eletronicos extends Produto {
	private String modelo;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Eletronicos() {
		super();
		this.modelo = modelo;
	}
	public String getResumo() {
		return "Nome: " + getNome() + ",Preço: " + getPreco() + ",Descricao: " + getDescricao() + ",Estoque: " + getEstoque() + ",Fabricante: " + getFabricante() + ",Modelo: " + getModelo();
	}
}
