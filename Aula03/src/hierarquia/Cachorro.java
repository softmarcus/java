package hierarquia;

public class Cachorro extends Mamifero {
	private boolean tipoLatido;

	public Cachorro(String nome, String classe, int velocidade, boolean tipoLatido) {
		super(nome, classe, velocidade);
		this.tipoLatido = tipoLatido;

	}

	public void setLateAlto() {
		tipoLatido = true;
	}

	public void setLateBaixo() {
		tipoLatido = false;
	}

	public void falar() {
		if (tipoLatido)
			System.out.println(getNome() + "Late ALTO: AU AU AU");
		else
			System.out.println(getNome() + "late baixo : au au au");
	}

	public String toString() {
		return "cachorro [tipoLatido=" + tipoLatido + ",getNome()=" + getNome() + "]";
	}
}
