package pojo;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente gabriel  = new Cliente(1);
		
		gabriel.nome = "Gabriel";
		gabriel.cpf = "5655656";
		gabriel.setId(2);
		imprimir(gabriel);
	
		ClientePF pf = new ClientePF(3);
		pf.setId(31);
		pf.nome = "luiz carlos";
		pf.cpf = "64464";
				
		
	}
	
	public static void imprimir(Cliente c){
		System.out.println(c.getId() +" "+ c.nome +" " + c.cpf);
	}

}
//getters and setters = alt + shift +s =>
