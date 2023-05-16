package listaExercicios;
import java.util.Scanner;

public class Questão01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		int a;
		
		System.out.printf("Digite um numero: ");
		a = ler.nextInt();
		
		if(a < 0) {
			a = -a;
			System.out.printf("O numero equivalente positivo é: %d", a);
		}
		else {
			System.out.printf("O numero é positivo e é igual a: %d", a);
		}
		
		
		
	}

}
