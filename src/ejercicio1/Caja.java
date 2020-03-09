package ejercicio1;

public class Caja<T>{

	private T cuadrada;
	
	public Caja() {
		
		cuadrada = null;
		
	}
	
	public void setCuadrada(T nuevoValor) {
		
		cuadrada = nuevoValor;
		
	}
	
	public T getCuadrada() {
		
		return cuadrada;
	}
		
		

}
