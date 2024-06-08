package hierarquia;

public class Ave extends Animal {

	// construtor da classe ave
	public Ave(String nome, String classe) {
		// chama construtor da classe da mae
		super(nome, classe);
	}

	@Override
	public void falar() {
		System.out.println(getNome() + "esta cantando");
	}

	public void voar() {
		System.out.println(getNome() + "esta voando...");
	}
}
