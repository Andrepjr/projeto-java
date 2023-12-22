package model;

public class Bebida extends Produto{
	private Double datadevalidade;
	private String ingredientes;
	private String alcoolico;
	private Integer volume;
	
	public Bebida() {
		super();
		this.datadevalidade = datadevalidade;
		this.ingredientes = ingredientes;
		this.alcoolico = alcoolico;
		this.volume = volume;
	}

	public Double getDatadevalidade() {
		return datadevalidade;
	}

	public void setDatadevalidade(Double datadevalidade) {
		this.datadevalidade = datadevalidade;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getAlcoolico() {
		return alcoolico;
	}

	public void setAlcoolico(String alcoolico) {
		this.alcoolico = alcoolico;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public String getResumo() {
		return "Nome: " + getNome() + ",Preço: " + getPreco() + ",Descricao: " + getDescricao() + ",Estoque: " + getEstoque() + ",Fabricante: " + getFabricante() + ",Data de validade: " + getDatadevalidade() + ",Ingredientes: " + getIngredientes() + ",alcoolico: " + getAlcoolico() + ",Volume: " + getVolume();
	}

	}

