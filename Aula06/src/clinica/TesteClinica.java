package clinica;

public class TesteClinica {

	public static void main(String[] args) {
		// alberto é um objeto polimorfico
		// pois é uma variavel que possui muitos tipos:
		// object,Pessoa,Humano,paciente,medicamento

		Humano alberto = new Pessoa("M", "Alberto Roberto");

		System.out.println("Dados da pessoa");
//		alberto.informaçoesCadastrais();
//		alberto.mostrahistoricoMedico();
//		alberto.mostraNome();

		// fazendo casting no objetode acordo com as regras de heranças e interface
		((Medicamento) alberto).infoDosagem();
		((Medicamento) alberto).infoMedicamento();

		// casting de pessoa
		((Pessoa) alberto).estadoCivil();

		Animal tom = new Gato("Mamífero", "Siamês");
		System.out.println("Dados do Animal");

		((Paciente) tom).mostraNome();
		((Paciente) tom).informaçoesCadastrais();
		((Paciente) tom).mostrahistoricoMedico();

		((Medicamento) tom).infoMedicamento();
		((Paciente) tom).infoDosagem();
		System.out.println(((Gato) tom).getEspecie());
		System.out.println(((Gato) tom).getRaca());

	}

}
