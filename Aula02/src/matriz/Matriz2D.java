package matriz;

public class Matriz2D {

	public static void main(String[] args) {
		int[][]matriz2D = new int[3][2];
		// 0 1 
		/*0 [10 20],
		 *1 [30 40],
		 *2[50 60], 
		 */

		//preenche a matriz
		//linha 0 
		matriz2D[0][0]= 10;
		matriz2D[0][1] = 20;
		
		//linha 1
		matriz2D[2][0] = 30;
		matriz2D[1][1] = 40;
		
		//linha 2
		matriz2D[2][0] = 50;
		matriz2D[1][1] = 60;
		
		System.out.println(matriz2D[2][1]); // 60
		System.out.println(matriz2D[0][0]); // 10
		System.out.println(matriz2D[1][1]); // 40
		
		for (int i=0; i<matriz2D.length;i++) {
			
			System.out.print(i + " [");
			
			for(int j=0;j<2; j++) {
				System.out.print(matriz2D[i][j]+ " ");
			}
			System.out.println(" ]");
		}
	}

}
