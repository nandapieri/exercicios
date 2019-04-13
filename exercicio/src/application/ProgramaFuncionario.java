package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class ProgramaFuncionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer id;
		Double salario, porcentagem;
		String nome;
		
		List <Funcionario> lista = new ArrayList();
		
		System.out.println("Numero de funcionarios");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite o id: ");
			id = sc.nextInt();
			System.out.println("Digite o Nome: ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.println("Digite o salario: ");
			salario = sc.nextDouble();
			lista.add(new Funcionario(id,nome,salario));
		}
		
		//imprime a lista
		for (Funcionario x: lista) {
			System.out.println(x.toString());
		}
		
		//aumenta o salario
		System.out.println("Digite o id: ");
		int i = sc.nextInt();

		Funcionario f = lista.stream().filter(x -> x.getId() == i).findFirst().orElse(null);
		if (f == null) {
			System.out.println("Id não encontrado");
		} else {
			System.out.println("Digite a porcentagem: ");
			porcentagem = sc.nextDouble();
			f.aumentaSalario(porcentagem);
		}
		
		//imprime a lista
		for (Funcionario x: lista) {
			System.out.println(x.toString());
		}
		sc.close();
	}

}
