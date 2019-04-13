package application;

import java.util.Scanner;

import entities.Aluguel;

public class ProgramaAluguel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, numQuarto;
		String nome, email;
		
		
		System.out.println("Numero de alugueis: ");
		n = sc.nextInt();
		
		Aluguel[] aluguel = new Aluguel[10];
		
		for (int i = 0; i<n; i++) {
			sc.nextLine();
			System.out.println("Digite o nome: ");
			nome = sc.nextLine();
			System.out.println("Digite o nome: ");
			email = sc.nextLine();
			System.out.println("Digite o numero do quarto: ");
			numQuarto = sc.nextInt();
			
			aluguel[numQuarto] = new Aluguel(nome, email, numQuarto);
		}
		
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i<aluguel.length; i++) {
			if (aluguel[i] != null) {
				System.out.println(aluguel[i].toString());
			}
		}
		
		sc.close();
	}

}
