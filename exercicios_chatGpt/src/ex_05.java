import java.util.Scanner;

public class ex_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite aqui um número e vamos mostrar a tabuada de vezes até 10: ");
		int N = sc.nextInt();
		
		for (int i=1; i<=10; i++) {
			int produto = N * i;
			
			System.out.println(N + " X " + i + " = " + produto);
			
		}
		

		sc.close();
	}
}
