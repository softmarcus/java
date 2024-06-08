package clinica;

public class Gato extends Animal implements Paciente{

	public Gato(String especie, String raca) {
		super(especie, raca);
	}

	public void fazerBarulho() {
		System.out.println("gato miando...");
	}
	public void mostraNome(){
		System.out.println("gato tom");
	}
	public void gethistoricoMedico() {
		System.out.println("historico : animal internado por doença sinomose...");
	}
	public void getInformaçoesCadastrais() {
		System.out.println("Tutor : valdeci menon");
	}

	@Override
	public void mostrahistoricoMedico() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void informaçoesCadastrais() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void infoDosagem() {
		// TODO Auto-generated method stub
		
	}

}
