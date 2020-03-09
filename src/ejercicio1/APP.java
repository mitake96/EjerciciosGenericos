package ejercicio1;

public class APP {

	public static void main(String[] args) {

		Caja<String> caja1 = new Caja<String>();
		Caja<Integer> caja2 = new Caja<Integer>();
		Caja<Boolean> caja3 = new Caja<Boolean>();
		
		
		
			caja1.setCuadrada("Caja cuadrada nº 1");
			caja2.setCuadrada(2);
			caja3.setCuadrada(false);
		
		System.out.println(caja1.getCuadrada());
		System.out.println("Caja cuadrada integer nº " + caja2.getCuadrada());
		System.out.println(caja3.getCuadrada());
		
		
		Persona pers1 = new Persona("Ana");
		
		Caja<Persona> persona = new Caja<Persona>();
		
		persona.setCuadrada(pers1);
		
		System.out.println(persona.getCuadrada());	// Prueba

	}

	

}

class Persona {
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	@Override
	public String toString() {
		return String.format("Persona [nombre=%s]", nombre);
	}



	String nombre;
}