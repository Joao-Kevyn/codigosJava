// opcional ao if-else quando se deseja dividir um valor com base em uma condição.
import java.util.Locale;
import java.util.Scanner;

public class ternaria {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite aqui o preço: ");
		double preco = sc.nextDouble();
		
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.5; // subistitui o if-else
		
//		if (preco < 20.0) {
//			desconto = preco * 0.1;
//		}
//		else {
//			desconto = preco * 0.5;
//		}
		
		System.out.println(desconto);
		
		sc.close();
	}
}
