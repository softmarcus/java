package interfaces;

public class SmartTv implements Tv {

	@Override
	public void ligar() {
		System.out.println("ligou smartTv");
	}

	@Override
	public void desligar() {
		System.out.println("desligou smarttv");

	}

	@Override
	public void sintonizarRedeTv() {
		System.out.println("sintonizando rede tv na smarttv");

	}

	@Override
	public void sintonizarCanalDoBoi() {
		System.out.println("sintonizando canal do boi Smart TV");

	}

	public void navegar() {
		System.out.println("surfando na web com a smart TVSSSS");
	}

	public void sintonizarAM() {
		System.out.println("Tv smart nao tem radio AM");
	}

	public void sintonizarFM() {
		System.out.println("tv smart sintonizando estação FM ... tocando funk ");
	}

}
