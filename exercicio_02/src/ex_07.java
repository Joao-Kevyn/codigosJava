import java.util.Scanner;
import java.util.Locale;

public class ex_07 {

	public static void main(String[] args ) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Digite aqui o valor do Eixo X: ");
		double eixoX = sc.nextDouble();
		System.out.println("Digite aqui o valor do Eixo y: ");
		double eixoY = sc.nextDouble();
		
		if (eixoX == 0.0 && eixoY == 0.0) {
			System.out.println("Origem");
		}
		else if (eixoX == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (eixoY == 0.0) {
			System.out.println("Eixo X");
		}
		else if (eixoX > 0.0 && eixoY > 0.0) {
			System.out.println("Q1");
		}
		else if (eixoX < 0.0 && eixoY > 0.0) {
			System.out.println("Q2");
		}
		else if (eixoX < 0.0 && eixoY < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
		
		sc.close();
	}
}
