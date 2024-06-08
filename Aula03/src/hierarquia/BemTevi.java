package hierarquia;

public class BemTevi extends Ave {
	public BemTevi(String nome,String classe) {
		super(nome,classe);
	}
	@Override
	public void falar() {
		System.out.println(getNome()+ "Canta : Bem ti vi ... bem te vi");
	}

}
