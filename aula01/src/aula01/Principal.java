package aula01;

import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Carro corolla = new Carro("toyota", "corolla", 2000);
		Carro gol = new Carro("VM", "gol", 2019);
		Carro fusca = new Carro("VM", "fusca", 1980);
		
		Moto m1 = new Moto("Honda","XRE",2023,500);
		Moto m2 = new Moto("Yamaha","Xmax",2023,600);
		Moto m3 = new Moto("Suzuki","Katana",2024,700);
				
		List<Veiculo> lista = List.of(corolla,gol,fusca,m1,m2,m3);
				
		//pega cada carro da lista e faz algo
		for (Veiculo v : lista) {
			v.info();
			v.ligar();
			v.acelerar();
		}
				
	}

}
