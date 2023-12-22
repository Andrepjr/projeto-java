package model;

public class Alimentos extends Produto {
	private Double Validade;
	private String Ingredientes;
	
	public Alimentos() {
		super();
		this.Validade = Validade;
		this.Ingredientes = Ingredientes;
	}


	public Double getValidade() {
		return Validade;
	}

	public void setValidade(Double validade) {
		Validade = validade;
	}

	public String getIngredientes() {
		return Ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		Ingredientes = ingredientes;
	}
	
	public String getResumo() {
		return "Nome: " + getNome() + ",Preço: " + getPreco() + ",Descricao: " + getDescricao() + ",Estoque: " + getEstoque() + ",Fabricante: " + getFabricante();
	}
}
