import java.util.Scanner;

public class calculadora_x {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite aqui um número para a tabuada de vezes até 10");
		int N = sc.nextInt();
		
		for (int i=1; i <=10; i++) {
			int produto = N * i;
			
			System.out.println(N + " x " + i + " = " + produto);
		}
		
		sc.close();
	}
}
