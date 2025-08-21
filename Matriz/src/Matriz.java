import java.util.Scanner;

public class Matriz{
	public static int[][] preencher(int matriz[][], Scanner sc) {
	
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j ++) {
				System.out.print("Preencha a matriz na posição: ["+i+"]["+j+"]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		return matriz;
	}
	
	public static void imprimir(int matriz[][]) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print("["+matriz[i][j]+"]");
			}
			System.out.print("\n");
		}
	}
	
	public static int somarMatriz(int matriz[][]){
		int contador = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				contador += matriz[i][j];
			}
		}
		
		return contador;
	}
	
	public static int[][] somarMatrizes(int matriz[][], int matriz2 [][],int linhas,int colunas){
		int novaMatriz[][] = new int[linhas][colunas];
		
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j ++) {
				novaMatriz[i][j] = matriz[i][j] + matriz2[i][j];
			}
		}
		return novaMatriz;
	}
	
	public static void encontrarValores(int matriz[][]) {
		int maior = matriz[0][0];
		int menor = matriz[0][0];
		String posMaior = "";
		String posMenor = "";
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j< matriz[i].length; j++) {
				if(matriz[i][j] < menor) {
					menor = matriz[i][j];
					posMenor = "A posição do menor valor é[" + i + "][" + j +"]";
				}
				if(matriz[i][j] > maior) {
					maior = matriz[i][j];
					posMaior = "A posição do maior valor é[" + i + "][" + j +"]";
				}
			}
		}
		
		System.out.println("O maior valor é: " + maior +", " + posMaior);
		System.out.println("O menor valor é: " + menor +", " + posMenor);
	}
	
	public static void imprimirDiagonal(int matriz[][], int linhas, int colunas) {
		System.out.print("Diagonal principal: \n");
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(i == j) {
					System.out.print("["+matriz[i][j]+"]");
				}else {
					System.out.print("[.]");
				}
				
				
			}
			System.out.print("\n");
		}
		
		System.out.print("Diagonal secundária: \n");
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(i + j == matriz.length - 1) {
					System.out.print("["+matriz[i][j]+"]");
				}else {
					System.out.print("[.]");
				}
				
				
			}
			System.out.print("\n");
		}
	}
	
	public static int[][] rotacionar90Direita(int matriz[][]) {
	    int N = matriz.length;
	    int[][] rotacionada = new int[N][N];
	    
	    for(int i = 0; i < N; i++) {
	        for(int j = 0; j < N; j++) {
	            rotacionada[j][N - 1 - i] = matriz[i][j];
	        }
	    }
	    return rotacionada;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de linhas da matriz: ");
		int linhas = sc.nextInt();
		
		System.out.print("Digite a quantide de colunas da matriz: ");
		int colunas = sc.nextInt();
		
		int matriz [][] = new int[linhas][colunas];
		preencher(matriz, sc);
		imprimir(matriz);
		int soma = somarMatriz(matriz);
		
		System.out.print("A soma dos valores da matriz é: " + soma + "\n");
		
		System.out.print("Digite a quantidade de linhas da matriz 2: ");
		int linhas2 = sc.nextInt();
		
		System.out.print("Digite a quantide de colunas da matriz 2: ");
		int colunas2 = sc.nextInt();
		
		boolean verificar = true;
		
		while(verificar) {
			if(colunas != colunas2 || linhas != linhas2) {
				System.out.print("As matrizes devem ser de tamanhos iguais!!\n");
				System.out.print("Digite a quantidade de linhas da matriz 2: ");
				linhas2 = sc.nextInt();
				
				System.out.print("Digite a quantide de colunas da matriz 2: ");
				colunas2 = sc.nextInt();
			}
			if(colunas == colunas2 && linhas == linhas2) {
				verificar = false;
			}
		}
		
		int matriz2[][] = new int[linhas2][colunas2];
		
		preencher(matriz2, sc);
		
		int matrizSomada[][] = somarMatrizes(matriz,matriz2,linhas,colunas); 
		
		System.out.print("A nova matriz será: \n");
		
		imprimir(matrizSomada);
		
		encontrarValores(matrizSomada);
		
		imprimirDiagonal(matrizSomada, linhas, colunas);
		
		System.out.print("A nova matriz rotacionada será: \n");
		
		int matrizRotacionada[][] = rotacionar90Direita(matrizSomada);
		
		imprimir(matrizRotacionada);
		
		sc.close();
		
	}
}
