package hierarquia;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
		Animal animal = new Animal("totó", "mamífero"); // construtor

		animal.imprimir();

		System.out.println(animal.getNome());
		animal.falar();

		// instancia um objeto da classe ave
		Ave ave = new Ave("Bem ti vi", "ave");
		ave.imprimir();
		ave.falar();
		ave.voar();

		Papagaio rico = new Papagaio("rico", "Ave");

		List<String> portugues = new ArrayList<>();
		portugues.add("bom dia");
		portugues.add("boa tarde");
		portugues.add("boa noite");
		portugues.add("olá! amiguinhos");
		portugues.add("tudo bem?");

		List<String> ingles = new ArrayList<String>();
		ingles.add("good morning");
		ingles.add("good aftenoon");
		ingles.add("Good night");
		ingles.add("hello friend");
		ingles.add("what's up");

		rico.setVocabulario(ingles);
		rico.falar();

		Animal a1 = new Vaca("mumu", "mamifero", 10, true);
		Animal a2 = new Papagaio("rico", "Ave");
		Animal a3 = new BemTevi("BemTevi", "Ave");
		Animal a4 = new Cachorro("totó", "mamífero", 45, true);

		List<Animal> animais = new ArrayList<>();
		animais.add(a1);
		animais.add(a2);
		animais.add(a3);
		animais.add(a4);

		for (Animal a : animais) {
			// verifica a instancia (tipo)
			if (a instanceof Vaca) {
				((Vaca) a).ordenhar();

			} else if (a instanceof BemTevi) {
				((BemTevi) a).voar();
			} else if (a instanceof Cachorro) {
				Cachorro cao = (Cachorro) a;
				cao.falar();
				cao.setLateBaixo();
				cao.falar();
				System.out.println(cao);
			}

		}
	}
}
