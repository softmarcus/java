package interfaces;

public class Veiculo {
	private String marca;
	private String modelo;

	public Veiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public void acelerar() {
		System.out.println("acelerando veiculo... vrummmmm");
	}

	public void freiar() {
		System.out.println("Veiculo freiando... SCRIIIICH");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
