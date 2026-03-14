import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite aqui o primeiro número: ");
		int numA = sc.nextInt();
		System.out.println("Digite aqui o segudno número: ");
		int numB = sc.nextInt();
		
		
		
		if (numA % numB == 0 || numB % numA == 0) {
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("Não são Multiplos");
		}
		sc.close();
	}
}
