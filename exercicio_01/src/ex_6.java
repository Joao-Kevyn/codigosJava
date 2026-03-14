import java.util.Locale;
import java.util.Scanner;

public class ex_6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;
		
		double valorA = sc.nextDouble();
		double valorB = sc.nextDouble();
		double valorC = sc.nextDouble();
		
		triangulo = valorA * valorC / 2; 
		circulo = valorC * valorC * pi; 
		trapezio = (valorA + valorB) / 2 * valorC;
		quadrado = valorB * valorB;
		retangulo = valorA * valorB;
		
		System.out.printf("Triangulo: %.3f%n", triangulo);
		System.out.printf("Circulo: %.3f%n", circulo);
		System.out.printf("Trapézio: %.3f%n", trapezio);
		System.out.printf("Quadrado: %.3f%n", quadrado);
		System.out.printf("Retângulo? %.3f%n", retangulo);
		
		
		sc.close();
	}
	
}
