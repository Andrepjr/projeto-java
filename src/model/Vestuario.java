package model;

public class Vestuario extends Produto {
	private Integer tamanho;
	private String cor;
	private String material;
	
	public Vestuario () {
		super();
		this.tamanho = tamanho;
		this.cor = cor;
		this.material = material;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	public String getResumo() {
		return "\nNome:\n " + getNome() + "\nPreço:\n " + getPreco() + "\nDescricao:\n " + getDescricao() + "\nEstoque:\n " + getEstoque() + "\nFabricante:\n " + getFabricante() + "\nTamanho:\n " + getTamanho() + "\nCor:\n " + getCor() + "\nmaterial:\n " + getMaterial();
	}
}
