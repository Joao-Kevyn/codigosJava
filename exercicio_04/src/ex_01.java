//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, 
//um valor por linha, inclusive o X, se for o caso


import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite aqui um valor maior que 1 e menor que 1000");
		int x = sc.nextInt();
		
		for (int i=0; i<=x; i++) {
			
			if (i % 2 !=0) {
				System.out.println(i);
			}
			
		}
		
		sc.close();
	}
}
