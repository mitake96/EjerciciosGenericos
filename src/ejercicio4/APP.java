package ejercicio4;

public class APP {

	public static void main(String[] args) {
		
		OperaMate<Integer> num1 = new OperaMate<Integer>(23);
		OperaMate<Double> num2 = new OperaMate<Double>(23.5);
		
		System.out.println("Rec�proco " + num1.reciproco());
		System.out.println("Fracci�n " + num1.fraccion());

		System.out.println("Rec�proco " + num2.reciproco());
		System.out.println("Fracci�n " + num2.fraccion());
	}

}

