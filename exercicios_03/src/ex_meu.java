import java.util.Scanner;

public class ex_meu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hamburger = 0;
		int pizza = 0;
		int sanduiche = 0;
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			
			if (tipo == 1) {
				hamburger = hamburger + 1;
			}
			else if (tipo == 2) {
				pizza = pizza + 1;
			}
			else if (tipo == 3){
				sanduiche = sanduiche + 1;
			}
			
			tipo = sc.nextInt();
		}
		System.out.println("Muito Obrigado! ");
		System.out.println("Hamburguer: " + hamburger);
		System.out.println("Pizza: " + pizza);
		System.out.println("Sanduiche: " + sanduiche);
		
		sc.close();
	}
}
