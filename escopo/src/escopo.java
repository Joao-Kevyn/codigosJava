public class escopo {

	public static void main(String[] args) {
		
		double preco = 400.00;
//		double desconto = 0; 
		
		if (preco < 200.00) {
			double desconto = preco * 0.1;
//			desconto = preco * 0.1;
		}
		
//		System.out.println(desconto); // da erro pq a variavel tá fora do escopo
		// ela está somente dentro do escopo do if
		System.out.println(preco);
		
		// para funcionar essa variavel eu tenho que declarar ele fora do escopo do if, 
		// e dentro do if tenho que colocar somente desconto = preo * 0.1; 
	}
}
