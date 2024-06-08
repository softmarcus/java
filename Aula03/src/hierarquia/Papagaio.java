package hierarquia;

import java.util.ArrayList;
import java.util.List;

public class Papagaio extends Ave {
	// declara uma variavel tipo lista
	private List<String> vocabulario;

	public Papagaio(String nome, String classe) {
		super(nome, classe);
		this.vocabulario = new ArrayList<>();

	}

	public void aprenderPalavra(String palavra) {
		this.vocabulario.add(palavra);
	}

	public void falar() {
		System.out.println(getNome() + "diz: ");
		if (!vocabulario.isEmpty()) {

			int indice = (int) (Math.random() * vocabulario.size());
			System.out.println(vocabulario.get(indice));
		} else {
			System.out.println(getNome() + "faz um som");

		}

	}

	public void setVocabulario(List<String> vocabulario) {
		this.vocabulario = vocabulario;
	}
}
