package ejercicio2;

public class APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Pareja<String, Integer> elemento1 = new Pareja<String, Integer>("22", 22);
		Pareja<Double, Double> elemento2 = new Pareja<Double, Double>(35.0, 35.0);
		
		elemento1.mostrarTipo();
		elemento2.mostrarTipo();
		
		System.out.println(elemento1.mismoTipo());
		System.out.println(elemento2.mismoTipo());

	}

}
