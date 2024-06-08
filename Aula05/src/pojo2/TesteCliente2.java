package pojo2;

import pojo.Cliente;
import pojo.ClientePF;

public class TesteCliente2 {

	public static void main(String[] args) {
		Cliente rafael = new Cliente(1);
		rafael.setId(2);
		//variavel protected : nao pode ser acessada por outro pacote
		//rafael.nome ="Rafael";
		//rafael.cpf = "54544"
				
	
	ClientePF pf = new ClientePF(3);
	pf.setId(31);
	//pf.nome = "luiz carlos";
	//variavel tipo default : nao pode ser acessada por outro pacote
//	pf.cpf = "64464";
			
	}

}
