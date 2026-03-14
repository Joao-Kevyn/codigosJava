import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número aqui: ");
		int N = sc.nextInt();
		
		int soma = 0;
		while (N != 0) {
			soma = soma + N;
			N = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
	}
}
