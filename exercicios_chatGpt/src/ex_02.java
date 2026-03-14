import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite aqui um número: ");
		int X = sc.nextInt();
		
		if (X % 2 == 0) {
			System.out.println("O número " + X + " É Par!");
		}
		else {
			System.out.println("O número " + X + " É Ímpar!");
		}
		
		sc.close();
	}
	
}
