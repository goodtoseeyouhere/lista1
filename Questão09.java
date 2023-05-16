package listaExercicios;
import java.util.Scanner;

public class Questão09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		float a, b;
		int opcao;
		
		System.out.printf("Digite o primeiro numero: ");
		a = ler.nextFloat();
		
		System.out.printf("Digite o segundo numero: ");
		b = ler.nextFloat();
		
		System.out.printf("\nDigite 1 para somar");
		System.out.printf("\nDigite 2 para subtrair");
		System.out.printf("\nDigite 3 para multiplicar");
		System.out.printf("\nDigite 4 para dividir");
		System.out.printf("\nDigite 5 para sair");
		System.out.printf("\nOpçao escolhida: ");
		
		opcao = ler.nextInt();
		
		switch(opcao) {
			case 1: System.out.printf("%f + %f = %f", a, b, a + b);
			break;
			
			case 2: System.out.printf("%f - %f = %f", a, b, a - b);
			break;
			
			case 3: System.out.printf("%f * %f = %f", a, b, a * b);
			break;
			
			case 4: System.out.printf("%f / %f = %f", a, b, a / b);
			break;
			
			case 5: System.out.printf("Programa encerrado.");
			break;
			
			default: System.out.printf("Opçao invalida.");
			
			
		}
		
		
	}

}
