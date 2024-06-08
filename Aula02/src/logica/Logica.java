package logica;

public class Logica {

	public static void main(String[] args) {
		// para i de 0 até 9 imprima
		for (int i = 0; i < 10; i++) {
			System.out.print(i + ", ");
		}
		System.out.println("\n");
		// CTRL F11

		// PARA i de 9 até 0 imprima
		for (int i = 9; i > 0; i--) {
			System.out.print(i + " ");
		}

		System.out.println("\n");
		// para i de 100 até 0 ,com passo 5
		for (int i = 0; i <= 100; i += 5) {
			System.out.print(i + " ");

		}
		System.out.println("\n");

		// para i de 100 até 0, com passo -5, imprima i
		for (int i = 100; i >= 0; i -= 5) {
			System.out.print(i + " ");
		}

		// tabuada do 2 : 2x0 até 2x10
		for (int i = 0; i <= 10; i++) {
			System.out.println(2 * i);
		}
		// tabuada do 9
		for (int i = 0; i <= 10; i++) {
			System.out.println(9 * i);
		}
		System.out.println("===========Tabuadas==========");
		for (int i = 1; i <= 10; i++) {
			System.out.println("---- Tabuada do " + i + "-----");

			for (int j = 0; j <= 10; j++) {
				System.out.println(i + "x" + j + " = " + i * j);
			}
		}

		/*
		 * potencia de x elevado a y 2 e 1 = 2 2 e 2 = 4 => 2x2 2 e 3 = 8 => 2x2x2 2 e 8
		 * = 256 2 e 10 = 1024=> 2x2x2x2x2x2x2
		 */
		int x = 1;
		for (int y = 1; y <= 16; y++) {
			x = 2 * x;
			System.out.println("2 ^ " + y + " = " + x);
		}
		System.out.println("usando pow : 2 ^ 8 : " + Math.pow(2, 8)); // 256

		System.out.println("\n===== Tipo char=====");
		char letra = 90;
		System.out.print(letra);
		System.out.println();
		for (char c = 48; c <= 57; c++) {
			System.out.print(c);
		}
		System.out.println();
		for (char c = 97; c <= 122; c++) {
			System.out.print(c);
		}
		System.out.println();
		for (char c = 65; c <= 90; c++) {
			System.out.print(c);

		}
		System.out.println();
		for (char c = 'a'; c <= 122; c++) {
			System.out.print(c);
		}

		for (int i = 0; i < 10; i++) {

			System.out.println("\nNumero randomico:" + (int) (Math.random() * 100));
		}

		for (int i = 0; i < 8; i++) {
			// gera uma senha aleatoria de 8 caracteres
			int cod = (int) (Math.random() * 26) + 97;
			char c = (char) cod;
			System.out.print(c);
		}
	}
}