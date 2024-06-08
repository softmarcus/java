package interfaces;

public class Carro extends Veiculo implements Radio {

	public Carro(String marca, String modelo) {
		super(marca, modelo);

	}

	@Override
	public void ligar() {
		System.out.println("ligou rádio do carro");

	}

	@Override
	public void desligar() {
		System.out.println("desligou radio do carro");

	}

	@Override
	public void sintonizarAM() {
		System.out.println("carro nao tem um radio AM");

	}

	@Override
	public void sintonizarFM() {
		System.out.println("sintonizando 99 FM no radio do carro ... tocando musica: Caneta azul ... Azul caneta");
	}

}
