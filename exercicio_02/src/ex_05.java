import java.util.Scanner;
import java.util.Locale;

public class ex_05 {

	public static void main(String[] args) {
		 
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Nossa Cardápio: ");
		System.out.println("1 - Cachorro Quente - R$ 4.00");
		System.out.println("2 - X-Salada - R$ 4.50");
		System.out.println("3 - X-Bacon - R$ 5.00");
		System.out.println("4 - Todada Simples - R$ 2.00");
		System.out.println("5 - Refrigerante - R$ 1.50");
		
		System.out.println("Digite o código aqui:");
		Locale.setDefault(Locale.US);
	
		int codigo = sc.nextInt();
		System.out.println("Digite a quantidade aqui:");
		int quantidade = sc.nextInt();
		
		double total;
		if (codigo == 1) {
			total = quantidade * 4.00;
		}
		else if (codigo == 2){
			total = quantidade * 4.50;
		}
		else if (codigo == 3) {
			total = quantidade * 5.00;
		}
		else if (codigo == 4) {
			total = quantidade * 2.00;
		}
		else {
			total = quantidade * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}
}
