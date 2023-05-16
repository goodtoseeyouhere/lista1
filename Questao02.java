package listaExercicios;
import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int a;
		
		System.out.printf("Digite um numero intero: ");
		a = ler.nextInt();
		
		if(a % 2 == 0) {
			System.out.printf("O numero é par!");
		}
		else {
			System.out.printf("O numero é impar!");
		}
		
		
	}

}
