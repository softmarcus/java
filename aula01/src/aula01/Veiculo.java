package aula01;
//classe mae ou superclasse = super()
public class Veiculo {

	// variaveis da classe (ficam no objeto = this)
	String marca; // null por padrao
	String modelo;
	int ano; // 0 por padrao
	boolean isLigado; // false por padrao

	// construtor da classe
	public Veiculo(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		System.out.println("chamou construtor do veiculo");
	}

	void ligar() {
		isLigado = true;
		System.out.println(modelo + "ligado");
	}

	void desligar() {
		isLigado = false;
		System.out.println(modelo + "desligado");
	}

	void acelerar() {
		if (isLigado)
			System.out.println(modelo + "acelerando... VRUM VRUM");
		else
			System.out.println(modelo + "esta desligado!");
	}

	void info() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		
		return "Veiculo(marca=" + marca + ",modelo=" + modelo + ",ano="+ ano +"]";
	}
}
