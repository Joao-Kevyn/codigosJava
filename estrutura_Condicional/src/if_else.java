import java.util.Scanner;

public class if_else {

	public static void main(String[] args ) {
		
		// Condicional Simples
//		int x = 5;
//		
//		System.out.println("Bom dia!");
//		
//		if(x < 0) { // x é 5 logo ele é maior que 0 por isso não saiu o boa tarde
//			System.out.println("Boa tarde!");
//		}
//
//		System.out.println("Boa noite!");
//		
//		
		
		//Condicional Composta
//		Scanner sc = new Scanner(System.in);
//		int hora; 
//		
//		System.out.println("Quantas horas? ");
//		hora = sc.nextInt();
//		
//		if(hora < 12) {
//			System.out.println("Bom dia! ");
//		}else {
//			System.out.println("Boa tarde");
//		}
//		
//		
//		sc.close();
		
		
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Digite o horario aqui: ");
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("Bom dia");
		}
		else {
			if(hora < 18) {
				System.out.println("Boa tarde");
			}
			else {
				System.out.println("Boa noite");
			}
		}
	}
}
