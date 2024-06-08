package hierarquia;

public class Vaca extends Mamifero {
	private boolean permiteOrdenha;

	public Vaca(String nome, String classe, int velocidade, boolean permiteOrdenha) {
		super(nome, classe, velocidade);
		this.permiteOrdenha = permiteOrdenha;
	}

	public void ordenhar() {
		if (permiteOrdenha) {
			System.out.println("Ordenhando a vaca " + getNome());
		} else {
			System.out.println("A vaca" + getNome() + " nao permite ordenha");
		}
	}

	public void falar() {
		System.out.println(getNome() + "diz:muuuuuuuuuuuu");
	}
}
