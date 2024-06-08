package aula04;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8727438806942532948L;
	
	//construtor da classe
	public 	Janela() {
		setSize(800,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		//cria label
		JLabel lblNome = new JLabel("digite o nome");
		lblNome.setLocation(100,100);
		lblNome.setSize(100,30);
		add(lblNome);
		
		//cria um campo de texto
		JTextField txtNome = new JTextField(50);
		txtNome.setLocation(200,100);
		txtNome.setSize(200,30);
		//adiciona na janela
		add(txtNome);
		
		JButton btnOK = new JButton("ok");
		btnOK.setLocation(350,500);
		btnOK.setSize(70,30);
		add(btnOK);
	}
	
}
