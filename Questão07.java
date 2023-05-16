package listaExercicios;
import java.util.Scanner;

public class Questão07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		float peso, altura;
		double imc;
		
		System.out.printf("Digite o seu peso: ");
		peso = ler.nextFloat();
		
		System.out.printf("Digite sua altura:");
		altura = ler.nextFloat();
		
		imc = peso / (altura * altura);
		
		if(imc < 18.5) {
			System.out.printf("CLASSIFICAÇÃO: Magreza");
		}
		else {
			if(imc > 18.5 && imc < 24.9) {
				System.out.printf("CLASSIFICAÇÃO: Normal");
			}
			else {
				if(imc > 25 && imc < 30) {
					System.out.printf("CLASSIFICAÇÃO: Obesidade");
				}
				else {
					System.out.printf("CLASSIFICAÇÃO: Obesidade grave");
				}
			}
		}
		
	}

}
