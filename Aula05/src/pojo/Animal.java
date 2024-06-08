package pojo;

public class Animal {

	private String especie;
	private String nome;
	private String barulho;

	public Animal(String especie, String nome, String barulho) {
		super();
		this.especie = especie;
		this.nome = nome;
		this.barulho = barulho;
	}

	// construtor com 3 parametros : alt shift s: generate constructor using fields

//getters e setters
	public String getEspecie() {
		return especie;
	}

	// evitar especie == ""
	public void setEspecie(String especie) {

		if (especie.isEmpty()) {
			// lanca uma excessao
			throw new RuntimeException("parametro especie nao pode ser vazio");

		}

		this.especie = especie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {

		if (nome.isEmpty()) {
			throw new RuntimeException("paramentro nome nao pode ser vazio");
		}
		this.nome = nome;
	}

	public String getBarulho() {
		return barulho;
	}

	public void setBarulho(String barulho) {
		this.barulho = barulho;
	}

	public void fazerBarulho() {
		System.out.println("Animal" + nome + "fazendo barulho" + barulho);
	}

}
