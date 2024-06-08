package produtos;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Cadastro {
	public static void main(String[] args) throws IOException {
		Scanner teclado = new Scanner(System.in);

		Produto[] lista = new Produto[3];

		for (int i = 0; i < lista.length; i++) {
			Produto p1 = new Produto();

			System.out.println("\n>>Nome do produto:");
			p1.nome = teclado.next();
			System.out.println("Preço R$:");
			p1.preco = teclado.nextFloat();
			System.out.println("Quantidade:");
			p1.quantidade = teclado.nextInt();

			lista[i] = p1;
		}
		salvar(lista);
	}
	public static void salvar(Produto[] lista) throws IOException{
		FileWriter gravador = new FileWriter("D:\\Curso Java Marcus\\Aula02\\produtos.csv",StandardCharsets.ISO_8859_1);
		gravador.write("Nome;Preço;Quantidade\n");
		
		for (int i=0;i<lista.length;i++) {
			Produto p = lista[i];
			gravador.write(p.toString());
			p.imprimir();
		}
		gravador.close();
		System.out.println("\nDados salvos em produtos.csv");
		
		
	}

}
