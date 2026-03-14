import java.util.Scanner;
import java.util.Locale;

public class ex_06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite aqui um número que vá de 1 a 100: ");
		double num = sc.nextDouble();
		
		if (num < 0.0 || num > 100 ) {
			System.out.println("Número fora do Intervalo");
		}
		else if (num <= 25.0) {
			System.out.println("Intervalo [0 , 25]");
		}
		else if (num <= 50.0) {
			System.out.println("Intervalo [25 , 50]");
		}
		else if (num <= 75.0) {
			System.out.println("Intervalo [50 , 75]");
		}
		else {
			System.out.println("Intervalo [75 , 100]");
		}
		
		
		sc.close();
	}
}
