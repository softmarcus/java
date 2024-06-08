package pojo;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Animal animal = new Animal("mamifero","Scooby","AU AU");
		//animal.setNome("");
		//animal.setEspecie("");
		animal.fazerBarulho();
		
		
		Cao snoopy = new Cao("Snoopy","WOLF WOLF WOLF");
		Gato tom = new Gato ("Tomcat","MEAW MEAW MEAW");
		
		snoopy.fazerBarulho();
		tom.fazerBarulho();
	
	}
	
	
	
	
}
