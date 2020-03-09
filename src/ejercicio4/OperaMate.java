package ejercicio4;

public class OperaMate<T extends Number> {
	
	T number;
	
	public OperaMate(T number) {
		this.number = number;
	}

	public T getNumber() {
		return number;
	}

	public void setNumber(T number) {
		this.number = number;
	}
	
	double reciproco() {
		return 1 /  number.doubleValue();
	}
	
	double fraccion() {
		return number.doubleValue() - number.intValue();
	}
}
