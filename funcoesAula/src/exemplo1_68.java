//O maior número de 3

import java.util.Scanner;

public class exemplo1_68 {
	
	public static void main (String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite aqui três números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		
		
		
/*
		if (a > b && a >  c) {
			System.out.println("O maior é o número: " + a);
		}
		else if (b > c) {
			System.out.println("O maior é o número: " + b);
		}
		else {
			System.out.println("O maior é o número: " + c);
		}
		*/
		
		int higher = max(a, b, c);
		
		mostrarResultado(higher);
		
		sc.close();
	}
	
//	Temos que criar as funções aqui pq ficam fora do escopo da função Main
	
//	cria a função o tipo dela, nome e os parametros
	public static int max(int x, int y, int z) {
//		vai serviar para guardar o resultado
		int auxiliar;
		
//		Passa a lógica da função
		if (x > y && x > z) {
			auxiliar = x;
		}
		else if (y > z) {
			auxiliar = y;
		}
		else {
			auxiliar = z;
		}
		return auxiliar; 
			
	}
	
//	imprimir resultado na tela mesmo se não tiver resultado por isso se usa o void
	public static void  mostrarResultado(int valor) {
		System.out.println("Maior = " + valor);
	}

}
