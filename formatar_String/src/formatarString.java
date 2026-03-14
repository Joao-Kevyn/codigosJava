
public class formatarString {
	
	public static void main (String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
//		DEIXAR MINÚSCOLO
		String s01 = original.toLowerCase();
		
//		DEIXAR MAIÚSCULO
		String s02 = original.toUpperCase();
		
//		TIRAR ESPAÇO 
		String s03 = original.trim();
		
//		PEGA DO CARCTER SELECIONADO PARA FRENTE
		String s04 = original.substring(2);
		
//		DA ONDE COMEÇA A CORTAR E ATÉ ONDE VAI O CORTE
		String s05 = original.substring(2, 9);
		
//		FAZER A TROCA DE UM CARACTER SELECIONADO POR OUTRO QUE FOI ESCOLHIDO
		String s06 = original.replace("a", "x");
		String s07 = original.replace("abc", "xy");
		
//		POSIÇÃO DO CARACTER - PRIMEIRA OCORRENCIA
		int i = original.indexOf("bc");
		
//		POSIÇÃO DO CARACTER - ULTIMA OCORRENCIA
		int j = original.lastIndexOf("bc");
		
		System.out.println("Originial: -" + original +"-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim : -" + s03 + "-");
		System.out.println("substring(2) : -" + s04 + "-");
		System.out.println("substring(2, 9) : -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("indexOf('bc'): " + i);
		System.out.println("lastIndexOf('bc'): " + j);
	}

}
