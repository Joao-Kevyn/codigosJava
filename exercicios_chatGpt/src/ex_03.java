import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite aqui quantos números serão digitados:  ");
		int N = sc.nextInt();
		
		int par = 0;
		int impar = 0;
		
		for (int i=0; i<N; i++) {
			int x = sc.nextInt();
			if (x % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		
		System.out.println(par);
		System.out.println(impar);
		
		sc.close();
	}
}
