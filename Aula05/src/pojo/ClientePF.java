package pojo;

public class ClientePF extends Cliente {

	public ClientePF(int id) {
		super(id);
	}

	public void mostrar() {
		System.out.println(getId() + " " + nome + " " + cpf);
	}
}
