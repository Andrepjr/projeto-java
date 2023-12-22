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
		return "\nNome:\n " + getNome() + "\nPreço: \n" + getPreco() + "\nDescricao: \n" + getDescricao() + "\nEstoque:\n " + getEstoque() + "\nFabricante:\n " + getFabricante() + "\nModelo:\n " + getModelo();
	}
}
