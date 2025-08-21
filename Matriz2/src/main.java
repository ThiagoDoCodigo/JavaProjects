import java.util.Scanner;


public class Main{
	public static int[][] preencher(int matriz[][], Scanner sc){
		
		for(int i = 0; i < matriz.length; i ++) {
			for(int j = 0;  j < matriz[i].length; j++) {
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
			sc.nextLine();
		}
	}
	
	public static void matriz(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de linhas da matriz A: ");
		int linhas = sc.nextInt();
		
		System.out.println("Digite a quantidade de colunas da matriz A: ");
		int colunas = sc.nextInt();
		
		int matrizA[][] =  new int[linhas][colunas];
		
		preencher(matrizA, sc);
		
		imprimir(matrizA, sc);
		
		sc.close();
	}
	
	
}
