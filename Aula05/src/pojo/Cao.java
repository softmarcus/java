package pojo;

public class Cao extends Animal {

	public Cao( String nome, String barulho) {
		// chama o consultor da classe mae
		// super precisa ser a primeira instrução a ser executada
		super("Mamifero", nome, barulho);
	}

}
