import java.util.Scanner;
//import java.util.Locale;

public class entrada {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in); // Aqui a gente cria o Scanner para fazer a entrada
//		
//		String x; // essa é a variavel
//		x = sc.next(); // a variavel "x" vai receber oque for digitado pelo teclado
//		System.out.println("Você digitou: " + x); 
//		
//		
//		
//		sc.close(); // fechar o scanner
		///////
		
//		Scanner sc = new Scanner(System.in);
//		
//		int x;
//		x = sc.nextInt(); // aqui usamos o "nextInt" para números inteiros
//		System.out.println("Você digitou: " + x);
//		
//		sc.close();
		///////
		
//		Locale.setDefault(Locale.US); // E aqui tem que escrever com '.'
//		Scanner sc = new Scanner(System.in);
//		
//		double x;
//		x = sc.nextDouble(); // Aqui se usa o "nextDouble" para número inteiros
////	System.out.println("Você digitou: " + x); // Já da com '.' pq já pega o formato
//		Locale.setDefault(Locale.US); // Deixa aqui se já digitar com vírgula
//		System.out.printf("Você digitou: %.2f%n", x); // O print f vai dar com vírgula
//	
//		sc.close();
		/////
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		char x; 
//		x = sc.next() .charAt(0); // Aqui usamos o ".charAt(0) para pegar somente o primeiro caractere"
//		System.out.println("Você digitou: " + x);
//		
//		sc.close();
		//////
		
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}
}
