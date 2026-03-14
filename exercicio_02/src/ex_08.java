import java.util.Locale;
import java.util.Scanner;


public class ex_08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto;
		
		System.out.println("Digite aqui seu salário: ");
		salario = sc.nextDouble();
		
		if (salario ==  0.0 ||salario < 2000.0) {
			imposto = 0.0;
			System.out.println("Isento");
		}
		else if (salario <= 3000.0) {
			imposto = salario * 8.0 / 100;
		}
		else if (salario <= 4500.00) {
			imposto = salario * 18 / 100;
		}
		else {
			imposto = salario * 28 / 100;
		}
		
		System.out.printf("R$ %.2f%n", imposto);
		
		sc.close();
	}
}
