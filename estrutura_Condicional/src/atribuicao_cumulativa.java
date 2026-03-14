import java.util.Scanner;

public class atribuicao_cumulativa {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite aqui a quantidade de minutos?: ");
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
//			conta = conta + (100 - conta) * 2.0; // esse é sem a atribuição cumulativa
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		sc.close();
	}
}
