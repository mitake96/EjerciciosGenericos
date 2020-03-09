package ejercicio4;

public class APP {

	public static void main(String[] args) {
		
		OperaMate<Integer> num1 = new OperaMate<Integer>(23);
		OperaMate<Double> num2 = new OperaMate<Double>(23.5);
		
		System.out.println("Recíproco " + num1.reciproco());
		System.out.println("Fracción " + num1.fraccion());

		System.out.println("Recíproco " + num2.reciproco());
		System.out.println("Fracción " + num2.fraccion());
	}

}

