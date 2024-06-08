package interfaces;

/* celular é um eletronico? sim
 * celular tem um radio?  sim
 * celular tem uma tv? sim
 */
public class Celular implements Radio,Tv {

	@Override
	public void ligar() {
		System.out.println("celular ligado");

	}

	@Override
	public void desligar() {
		System.out.println("celular desligado");

	}

	@Override
	public void sintonizarAM() {
		System.out.println("Sintonizando radio AM no celular");

	}

	@Override
	public void sintonizarFM() {
		System.out.println("Sintonizando radio FM no celular");

	}

	public void fazerligaçao() {
		System.out.println("celular ligando...");
	}

	public void sintonizarRedeTv() {
		System.out.println("celular exibindo programe rede TV");
	}

	public void sintonizarCanalDoBoi() {
		System.out.println("celular exibindo programe Canal do Boi");
	}
}