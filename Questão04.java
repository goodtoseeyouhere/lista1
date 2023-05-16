package listaExercicios;
import java.util.Scanner;

public class Questão04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Scanner ler = new Scanner(System.in);
		
		float a, b, c;
		
		System.out.printf("Digite o primeiro numero: ");
		a = ler.nextFloat();
		
		System.out.printf("Digite o segundo numero: ");
		b = ler.nextFloat();
		
		System.out.printf("Digite o terceiro numero: ");
		c = ler.nextFloat();
		
		if(a > b && a > c) {
			System.out.printf("O maior numero é: %.2f", a);
		}
		else {
			if(b > a && b > c) {
				System.out.printf("O maior numero é: %.2f", b);
			}
			else {
				System.out.printf("O maior numero é : %.2f", c);
			}
		
		
		}
		
	}
}
