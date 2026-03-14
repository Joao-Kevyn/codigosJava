import java.util.Scanner;

public class ex_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		Tambem se pode fazer assim: 
//		int valor1, valor2, soma; 
//		valor1 = sc.nextInt();
//		valor2 = sc.nextInt();
//		soma = valor1 + valor2;
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int soma = valor1 + valor2; 
		
		System.out.println("Soma = " + soma);
		
		sc.close(); 
	}
}
