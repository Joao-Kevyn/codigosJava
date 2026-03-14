import java.util.Scanner;

public class ex_02 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite seu número aqui:");
	int num = sc.nextInt();
	
	if(num % 2 == 0) {
		System.out.println("Número Par");
	}
	else {
		System.out.println("Número Ímpar");
		
	}
	sc.close();
	}
}
