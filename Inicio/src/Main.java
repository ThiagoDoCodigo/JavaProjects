import java.util.Scanner;


public class Main{
	public static int[][] preencher(int matriz[][], Scanner sc){
		
		for(int i = 0; i < matriz.length; i ++) {
			for(int j = 0;  j < matriz[i].length; j++) {
				System.out.print("Digite o valor na matriz ["+ i + "]["+ j + "]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		return matriz;
	}
	
	
	public static void imprimir(int matriz[][], Scanner sc) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j ++) {
				System.out.print("["+matriz[i][j]+"]");
			}
			System.out.print("\n");
		}
	}
	
	public static void imprimirRotacionada(int matriz[][], int linhas, int colunas) {
		int matrizRotacionada[][] = new int[linhas][colunas];
		for(int i = 0; i < linhas; i++) {
			for(int j = 0;  j < colunas; j++) {
				matrizRotacionada[j][linhas - 1 - i] = matriz[i][j];
			}
			
		}
		for(int i = 0; i < matrizRotacionada.length; i++) {
			for(int j = 0; j < matrizRotacionada[i].length; j ++) {
				System.out.print("["+matrizRotacionada[i][j]+"]");
			}
			System.out.print("\n");
		}
	}
	
	public static void imprimirDiagonal(int matriz[][]) {
		System.out.println("Diagonal principal será: \n");
		for(int i = 0; i < matriz.length; i ++) {
			for(int j = 0 ; j < matriz[i].length; j ++) {
				if(i == j) {
					System.out.print("["+matriz[i][j]+"]");
				}else {
					System.out.print("[.]");
				}
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.println("Diagonal secundária será: \n");
		for(int i = 0; i < matriz.length; i ++) {
			for(int j = 0 ; j < matriz[i].length; j ++) {
				if(i + j == matriz.length - 1) {
					System.out.print("["+matriz[i][j]+"]");
				}else {
					System.out.print("[.]");
				}
				
			}
			System.out.print("\n");
		}
		
	}
	
	public static void say(String text) {
		System.out.print(text);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		say("Digite a quantidade de linhas da matriz A: ");
		int linhas = sc.nextInt();
		
		System.out.println("\n----------------------------------------------------------------\n");
		
		say("Digite a quantidade de colunas da matriz A: ");
		int colunas = sc.nextInt();
		
		System.out.println("\n----------------------------------------------------------------\n");
		
		int matrizA[][] =  new int[linhas][colunas];
		
		preencher(matrizA, sc);
		
		System.out.println("\n----------------------------------------------------------------\n");
		
		System.out.println("A matriz A será: ");
		
		imprimir(matrizA, sc);
		
		System.out.println("\n----------------------------------------------------------------\n");
		
		System.out.println("A matriz A rotacionada será: ");
		
		imprimirRotacionada(matrizA, linhas, colunas);
		
		System.out.println("\n----------------------------------------------------------------\n");
		
		imprimirDiagonal(matrizA);
		
		System.out.println("\n----------------------------------------------------------------\n");
		
		sc.close();
	}
	
	
}
