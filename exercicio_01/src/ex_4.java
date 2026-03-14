import java.util.Scanner;
import java.util.Locale;

public class ex_4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario = sc.nextInt();
		int horaTrabalhada = sc.nextInt();
		double valorHora = sc.nextDouble();
		double salario = horaTrabalhada * valorHora; 
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}
}
