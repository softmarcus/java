package matriz;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Matriz1D {

	public static void main(String[] args) throws IOException {

		// array (matriz) 1D - Unidemensional (vetor)
		// pode ser de qualquer tipo: int,float,String,boolean
		int[] matriz1D = new int[5];// posiçoes :0 a 4

		// preenche a matriz
		matriz1D[0] = 50;
		matriz1D[1] = 20;
		matriz1D[2] = 10;
		matriz1D[3] = 40;
		matriz1D[4] = 30;

		System.out.println(matriz1D[0]);
		System.out.println(matriz1D[2]);
		System.out.println(matriz1D[4]);

		Arrays.sort(matriz1D);
		System.out.println(Arrays.toString(matriz1D));
		System.out.println("Tamnho:" + matriz1D.length);

		// array de 1D strings
		// {}=> inicializador de array
		// indice = 0 1 2 3 4
		String[] frutas = { "abacate", "banana", "laranja", "uva", "kiwi" };
		Arrays.sort(frutas);
		System.out.println(Arrays.toString(frutas));
		// usando loop for para imprimir o array
		System.out.println("\nImprimindo o array com loop for");
		for (int i = 0; i < 5; i++) {
			System.out.println(frutas[i]);

		}

		// cria um array com 3 posiçoes
		String[] produtos = new String[3];

		for (int i = 0; i < produtos.length; i++) {
			System.out.println(produtos[i]);
		}

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < produtos.length; i++) {
			System.out.println("Digite o nome do produto" + (i + 1) + "/" + produtos.length);
			String nome = teclado.next();
			produtos[i] = nome;
		}
		Arrays.sort(produtos);
		System.out.println(Arrays.toString(produtos));
		
		FileWriter gravador = new FileWriter("D:/Curso Java Marcus/Aula02/produtos.txt");
		gravador.write(Arrays.toString(produtos));
		gravador.close();
	}
}
