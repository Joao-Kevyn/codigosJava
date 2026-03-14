import java.util.Scanner;
import java.util.Locale;

public class teste_thiago {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salário : ");
		double idade = sc.nextDouble();
		
		System.out.printf("Sua idade é: %.2f%n ", idade);
	
		sc.close();
	}
		

	
}
