package Turma15;

import java.util.Scanner;

public class ExercicioCond4 {
    
	public static void main(String[] args) {
	
		
	try (Scanner ler = new Scanner(System.in)){
		
		double num, raiz, elevado;
		
		System.out.println("Entre com um número: ");
		num = ler.nextDouble();
		
		if (num%2==0)
		{
			raiz = Math.sqrt(num);
			System.out.println("\nSeu número"+num+" é par e a sua raiz quadrada é: " +raiz);
		}
		else 
		{
			elevado = Math.pow(num,2);
			System.out.println("\nSeu número"+num+" é ímpar e elevado ao quadrado ficará: "+elevado);			
		}
		
	}

}
}
