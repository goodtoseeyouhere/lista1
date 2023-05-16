package listaExercicios;
import java.util.Scanner;

public class Questão03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		float a;
		
		System.out.printf("Digite um numero: ");
		a = ler.nextFloat();
		
		if(a >= 0 && a <= 10) {
			System.out.printf("O numero está entre 0 e 10");			
		}
		else {
			System.out.printf("O numero não está entre 0 e 10");
		}
	
	}

}
