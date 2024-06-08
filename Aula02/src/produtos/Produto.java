package produtos;

public class Produto {
	String nome;
	float preco;
	int quantidade;
	
	void imprimir() {
		System.out.printf("produto: %s Preço R$ %.2f quantidade: %d\n",nome ,preco, quantidade);
		

	}
	@Override
	public String toString() {
			return String.format("%s;%.2f;%d\n",nome,preco,quantidade);
	}
}
