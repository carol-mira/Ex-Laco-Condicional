package Turma15;

import java.util.Scanner;

public class ExercicioCond3 {
public static void main(String[] args) {
	float idade;
	
	try (Scanner ler = new Scanner(System.in))
	{
		System.out.println("Digite a idade:");
		idade = ler.nextFloat();
		
		if ((idade >= 10)&& (idade <= 14))
		{
			System.out.println("\nEsta idade é considerada Infantil! "+ idade);
		}
		else if ((idade >= 15) && (idade <= 17))
		{
			System.out.println("\nEsta idade é considerada Juvenil! "+ idade);
		}
		else if ((idade >= 18) && (idade <= 25))
		{
			System.out.println("\nEsta idade é considerada Adulto! "+ idade);
		}
		else if ((idade >=26) && (idade <=124))
			{
			System.out.println("\nParabéns você é um ADULTÃO! "+ idade);
			
		}
	}
}
}
