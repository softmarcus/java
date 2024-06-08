package pojo;

public class Cliente {

	// visibilidade dos atributos da classe
	// default = "sem nada"
	// private = privado => somemte a classe pode acessar
	// public = publico => qualquer classe pode acessar
	// protected = protegido => somente as classe do mesmo pacote pode acessar

	private int id;           // U
	protected String nome;
	String cpf;

	public Cliente(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


}