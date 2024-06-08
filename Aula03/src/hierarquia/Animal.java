package hierarquia;

public class Animal {
	//variavel so pode ser acessada dentro da classe
	private String nome;
// so pode ser acessada dentro do pacote
	protected String classe;
// construtor da classe  é sempre o primeiro metodo a ser chamado
	public Animal(String nome, String classe) {
		this.nome = nome;
		this.classe = classe;

	}

	public void imprimir() {
		System.out.println("Nome;" + nome + ", Classe: " + classe);
	}

	public String getNome() {
		return nome;
	}

	public void falar() {
		System.out.println(nome + " faz um som ");
	}
}
