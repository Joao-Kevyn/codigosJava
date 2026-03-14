import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva aqui a coordenada x: ");
		int x = sc.nextInt();
		System.out.println("Escreva aqui a coordenada y: ");
		int y = sc.nextInt();
		
		while (x != 0.0 && y != 0.0) {
			
			if (x < 0 && y > 0) {
				System.out.println("Primeiro");
			}
			else if (x > 0 && y > 0) {
				System.out.println("Segundo");
			}
			else if (x < 0 && y < 0) { 
				System.out.println("Terceiro");
			}
			else if (x > 0 && y < 0) {
				System.out.println("Quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
			
		}
		
		sc.close();
	}
}
