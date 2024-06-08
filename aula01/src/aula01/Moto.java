package aula01;

public class Moto extends Veiculo {

	int cilindradas;
	
	public Moto(String marca,String modelo,int ano,int cilindradas) {
		super(marca,modelo,ano);
		this.cilindradas= cilindradas;
	}
	@Override
	public String toString() {
		return "Moto[cilindradas="+cilindradas+",marca=" + marca + ",modelo=" + modelo + ",ano="+ ano +"]";
	}
}
