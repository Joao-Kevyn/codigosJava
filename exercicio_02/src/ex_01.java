import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite aqui seu número:");
		int num = sc.nextInt();
		
		if (num >= 0 ) {
			System.out.println("Positivo");
		}
		else {
			System.out.println("Negativo");
		}
		
		
		sc.close();
	}
}
