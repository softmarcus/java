package aula01;

public class Carro extends Veiculo {

	// construtor da classe
	public Carro(String marca, String modelo, int ano) {
		// chama o construtor
		super(marca, modelo, ano);
		System.out.println("chamou o construtor do carro");
	}

	@Override
	public String toString() {
		return "Carro(marca=" + marca + ",modelo=" + modelo + ",ano=" + ano + "]";
	}
}