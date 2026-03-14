import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite aqui um número inteiro: ");
		int N = sc.nextInt(); 
		
		if (N == 0) {
			System.out.println("Zero");
		}
		else if (N > 0) {
			System.out.println("Positivo");
		}
		else {
			System.out.println("Negativo");
		}
		
		sc.close();
	}
}
