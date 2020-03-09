package ejercicio2;

public class Pareja<T, V> {
	
	T pareja1;
	V pareja2;
	
	public Pareja (T elemento1, V elemento2) {
		pareja1 = elemento1;
		pareja2 = elemento2;
	}

	public T getElementT() {
		return pareja1;
	}

	public void setElementT(T elementT) {
		this.pareja1 = elementT;
	}

	public V getElementV() {
		return pareja2;
	}

	public void setElementV(V elementV) {
		this.pareja2 = elementV;
	}
	
	public void mostrarTipo() {
		System.out.println(pareja1.getClass().getName());
		System.out.println(pareja2.getClass().getName());
	}
	
	public boolean mismoTipo() {
		return pareja1.getClass().getName().equals(pareja2.getClass().getName());
	}
}
