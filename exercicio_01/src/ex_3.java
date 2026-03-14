import java.util.Scanner;

public class ex_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valorA = sc.nextInt();
		int valorB = sc.nextInt();
		int valorC = sc.nextInt();
		int valorD = sc.nextInt();
		int diferenca = valorA * valorB - valorC * valorD;
		
		System.out.println("Diferença = " + diferenca);
		
		
		sc.close();
	}
}
