package application;

import java.util.Scanner;

public class ProgramaMatriz {

	public static void main(String[] args) {
		
		int lin,col;
		Scanner sc = new Scanner(System.in);
		
		// Ler a matriz
		System.out.println("Numero de linhas: ");
		lin = sc.nextInt();
		System.out.println("Numero de colunas: ");
		col = sc.nextInt();
		
		int [][] matriz = new int [lin][col];
		
		for (int i=0; i<lin; i++) {
			for (int j=0; j<col; j++)
				matriz[i][j] =  sc.nextInt();
		}
		
		System.out.println("Digite o numero: ");
		int x = sc.nextInt();
		
		for (int i=0; i<lin; i++) {
			for (int j=0; j<col; j++) {
				if (matriz[i][j] == x) {
					System.out.println("Posição: "+i+","+j);
					//acima
					if (i>0) {
						System.out.println("Acima: "+matriz[i-1][j]);
					}
					//abaixo
					if (i<col) {
						System.out.println("Abaixo: "+matriz[i+1][j]);
					}
					//direita
					if (j<lin) {
						System.out.println("Direita: "+matriz[i][j+1]);
					}
					//esquerda
					if (j>0) {
						System.out.println("Esquerda: "+matriz[i][j-1]);
					}
				}
					
			}
		}
		
		
		sc.close();

	}

}
