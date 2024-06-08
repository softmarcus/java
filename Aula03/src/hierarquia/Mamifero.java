package hierarquia;

public class Mamifero extends Animal {
	private int velocidade;

	public Mamifero(String nome, String classe, int velocidade) {
		// chama o construtor
		super(nome, classe);
		this.velocidade = velocidade;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;

	}

	public void correr() {
		System.out.println(getNome() + "esta correndo a uma velocidade de" + velocidade + "km/h");
	}
}
