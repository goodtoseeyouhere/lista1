package listaExercicios;
import java.util.Scanner;

public class Questão05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// upper case doesn't work
		
		Scanner ler = new Scanner(System.in);
		
		char letra;
		
		System.out.printf("Digite uma letra: ");
		letra = ler.next().charAt(0);
		
		if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o'|| letra == 'u' ) {
			System.out.printf("A letra digitada é uma vogal!");
		}
		else {
			System.out.printf("A letra digitada é uma consoante!");
		}
		
		
	}

}
