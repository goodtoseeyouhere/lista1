package listaExercicios;

import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int resposta1, resposta2, resposta3;

        System.out.printf("Pense em um numero de 1 a 8!");
        System.out.printf("\nDigite 1 para sim e 2 para não.");

        // 2 4 6 8
        System.out.printf("\nSeu numero é par?");
        resposta1 = ler.nextInt();

        if(resposta1 == 1) {
            System.out.printf("Seu numero é maior ou igual a 6?");
            resposta2 = ler.nextInt();

            if(resposta2 == 1) {
                System.out.printf("Seu numero é maior que 7?");
                resposta3 = ler.nextInt();
                if(resposta3 == 1) {
                    System.out.printf("Seu numero é 8!");
                } else {
                    System.out.printf("Seu numero é 6!");
                }
            } else {
                System.out.printf("Seu numero é maior que 3?");
                resposta2 = ler.nextInt();
                if(resposta2 == 1){
                    System.out.printf("Seu numero é 4!");	    					
                } else {
                    System.out.printf("Seu numero é 2!");
                }
            }
        }

        // 1 3 5 7

        else {
            System.out.printf("Seu numero é maior ou igual a 5?");
            resposta2 = ler.nextInt();
            if(resposta2 == 1) {
                System.out.printf("Seu numero é maior que 6?");
                resposta3 = ler.nextInt();
                if(resposta3 == 1) {
                    System.out.printf("Seu numero é 7!");  			    		
                } else {
                    System.out.printf("Seu numero é 5!");
                }
            } else {
                System.out.printf("Seu numero é maior que 2?");
                resposta2 = ler.nextInt();
                if(resposta2 == 1) {
                    System.out.printf("Seu numero é 3!");   				
                } else {
                    System.out.printf("Seu numero é 1!");
                }
            }	    			
        }
    }
}
