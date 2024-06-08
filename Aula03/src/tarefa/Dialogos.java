package tarefa;

import javax.swing.JOptionPane;

public class Dialogos {

	public static void main(String[] args) {
		int resp = JOptionPane.showConfirmDialog(null, "confirma");
		System.out.println(resp);
		switch (resp) {

		case -1:
			System.out.println("clicou fechar");
			break;

		case 0:
			System.out.println("clicou yes");
			break;
		case 1:
			System.out.println("clicou no");
			break;
		case 2:
			System.out.println("cliclou cancelar");
			break;
		}

	}

}
