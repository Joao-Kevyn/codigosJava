import java.util.Scanner;
import java.util.Locale;

public class ex_5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPec1, numPec1, codPec2, numPec2;
		double valPec1, valPec2, valor; 
		
		codPec1 = sc.nextInt();
		numPec1 = sc.nextInt();
		valPec1 = sc.nextDouble();
		
		codPec2 = sc.nextInt();
		numPec2 = sc.nextInt();
		valPec2 = sc.nextDouble();
		
		valor = numPec1 * valPec1 + numPec2 * valPec2;

		
		System.out.printf("Valor a pagar: R$ %.2f%n", valor);
		
		sc.close();
	}
}
