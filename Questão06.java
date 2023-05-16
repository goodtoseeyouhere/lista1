package listaExercicios;
import java.util.Scanner;

public class Questão06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variables values must be between 0 and 10
		
		Scanner ler = new Scanner(System.in);
		
		float a, b, c;
		double media;
		
		System.out.printf("Digite o valor da primeira prova: ");
		a = ler.nextFloat();
		
		System.out.printf("Digite o valor da segunda prova: ");
		b = ler.nextFloat();
		
		System.out.printf("Digite o valor da terceira prova: ");
		c = ler.nextFloat();
		
		media = a + b + c / 3;
		
		if(media >= 6) {
			System.out.printf("Parabens você foi aprovado!");			
		}
		else {
			System.out.printf("Sinto muito, você foi reprovado.");
		}
		
		
	}

}
