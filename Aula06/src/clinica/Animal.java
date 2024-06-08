package clinica;

abstract public class Animal {

	private String especie;
	private String raca;

	public Animal(String especie, String raca) {
		super();
		this.especie = especie;
		this.raca = raca;
	}

	abstract public void fazerBarulho();

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

}
