package interfaces;

public class Testeinterface {

	public static void main(String[] args) {
		Celular samsung = new Celular();

		samsung.ligar();
		samsung.desligar();
		samsung.sintonizarAM();
		samsung.sintonizarFM();
		samsung.sintonizarRedeTv();
		samsung.sintonizarCanalDoBoi();
		samsung.fazerligaçao();
		
		System.out.println("----------------");
		SmartTv tv = new SmartTv();
		tv.ligar();
		tv.desligar();
		tv.navegar();
		tv.sintonizarFM();
		tv.sintonizarAM();
		
		System.out.println("---------------");
		Carro gol = new Carro("VW","Gol");
		gol.acelerar();
		gol.freiar();
		gol.ligar();
		gol.sintonizarAM();
		gol.sintonizarFM();
		gol.desligar();
		
		System.out.println("-------------------\ntocando musica");
		tocarMusica(gol);
	}
	public static void tocarMusica(Radio radio) {
		radio.sintonizarFM();
	}
}