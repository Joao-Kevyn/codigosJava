import java.util.Locale; 

public class Program {

	public static void main(String[] args) {
		
		int y = 32; 
		double x = 10.35784;
		
//		System.out.println(y);
		System.out.println(x);
		System.out.printf("%2.2f%n", x); // aqui estamos controlando as casa decimais   
		System.out.printf("%.4f%n", x);
		System.out.println("Bom Dia!"); 
		Locale.setDefault(Locale.US); // Trocando a saída dos número de "," para "." 
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + " METROS"); // Concatenando com o + 
		System.out.printf("RESULTADO = %.2f metros%n", x); // Concatenando no printf
		
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}
}
