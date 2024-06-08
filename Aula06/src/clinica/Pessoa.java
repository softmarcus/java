package clinica;

public class Pessoa extends Humano implements Paciente, Medicamento {

	private String nome;

	public Pessoa(String sexo,String nome) {
		super(sexo);
		this.nome = nome;
	}

	public void infoMedicamento() {
		System.out.println("medicamento para controle da dengue...");
	}

	public void infoDosagem() {
		System.out.println("um comprimido a cada 8 horas");
	}

	public void mostraNome() {
		System.out.println(nome);
	}

	public void mostraHistoricoMedico() {
		System.out.println("historico: em tratamento");
	}

	@Override
	public void mostrahistoricoMedico() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void informaçoesCadastrais() {
		// TODO Auto-generated method stub
		
	}

	public void estadoCivil() {
		// TODO Auto-generated method stub
		
	}
}
