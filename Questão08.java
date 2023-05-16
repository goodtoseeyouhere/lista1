package listaExercicios;
import java.util.Scanner;

public class Questão08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		double salario, prestacao;
		
		System.out.printf("Digite o seu salario: ");
		salario = ler.nextDouble();
		
		System.out.printf("Digite a sua prestacao: ");
		prestacao = ler.nextDouble();
		
		if(prestacao <= salario * 0.3) {
			System.out.printf("Emprestimo concedido.");
		}
		else {
			System.out.printf("Emprestimo não concedido");
		}
		
		
	}
	
}
