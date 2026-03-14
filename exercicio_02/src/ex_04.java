import java.util.Scanner;

public class ex_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int duracao;
		
		System.out.println("Digite aqui a hora que o jogo começou: ");
		int horaIni = sc.nextInt();
		System.out.println("Digite aqui a hora que o jogo acabou: ");
		int horaFin = sc.nextInt();
		

		
		if (horaIni < horaFin) {
			duracao = horaFin - horaIni;
		}
		else {
			duracao = 24 - horaIni + horaFin;
		}
		
		System.out.println("O jogo Dourou " + duracao + " Horas(s)");
		
		sc.close();
	}
}
