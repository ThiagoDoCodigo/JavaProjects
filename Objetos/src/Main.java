import java.util.Scanner;
import java.util.ArrayList;

class Produto{
	String nome;
	String marca;
	String cean;
	double valor;
	double icms;
	double ipi;
	double pis;
	double cofins;
	
	Produto(String nome, String marca, String cean, double valor, double icms, double ipi ,double pis, double cofins){
		this.nome = nome;
		this.marca = marca;
		this.cean = cean;
		this.valor = valor;
		this.icms = icms;
		this.ipi = ipi;
		this.pis = pis;
		this.cofins = cofins;
	}
	
	void calcularImpostoTotal() {
		double aliquotaTotal = icms + ipi + pis + cofins;
		double valorImposto = valor * (aliquotaTotal/100);
		System.out.print("O imposto embutido total do produto é: R$"+ valorImposto);
	}
	void calcularIcms() {
		double aliquotaTotal = icms;
		double valorImposto = valor * (aliquotaTotal/100);
		System.out.print("O imposto embutido icms do produto é: R$"+ valorImposto);
	}
	void calcularIpi() {
		double aliquotaTotal = ipi;
		double valorImposto = valor * (aliquotaTotal/100);
		System.out.print("O imposto embutido ipi do produto é: R$"+ valorImposto);
	}
	void calcularPis() {
		double aliquotaTotal = pis;
		double valorImposto = valor * (aliquotaTotal/100);
		System.out.print("O imposto embutido pis do produto é: R$"+ valorImposto);
	}
	void calcularCofins() {
		double aliquotaTotal = cofins;
		double valorImposto = valor * (aliquotaTotal/100);
		System.out.print("O imposto embutido cofins do produto é: R$"+ valorImposto);
	}
	
}



public class Main {
	public static void sayln(String text) {
		System.out.println(text);
	}
	
	public static void say(String text) {
		System.out.print(text);
	}
	
	public static void ln() {
		System.out.print("\n-------------------------------------------------------\n");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<>();
		
		
		while (true) {
			sayln("\n1- Cadastrar novo produto");
			sayln("2- Pesquisar produto pelo CEAN e verificar valores de impostos");
			sayln("3- Sair");
			say("Escolha: ");
			int opc = sc.nextInt();
			sc.nextLine();
			ln();
			
			if(opc == 1) {
				say("CEAN: ");
				String cean = sc.nextLine();
				ln();
				say("Nome: ");
				String nome = sc.nextLine();
				ln();
				say("Marca: ");
				String marca = sc.nextLine();
				ln();
				say("Valor: ");
				double valor = sc.nextDouble();
				ln();
				say("ICMS (%): ");
				double icms = sc.nextDouble();
				ln();
				say("IPI (%): ");
				double ipi = sc.nextDouble();
				ln();
				say("PIS (%): ");
				double pis = sc.nextDouble();
				ln();
				say("COFINS (%): ");
				double cofins = sc.nextDouble();
				sc.nextLine();
				ln();
				produtos.add(new Produto(nome, marca, cean, valor, icms, ipi, pis, cofins));
				sayln("Produto cadastrado com sucesso");
			}else if(opc == 2) {
				say("Digite o CEAN do produto: ");
				String pesquisa = sc.nextLine();
				boolean verificar = false;
				
				
				for(Produto p : produtos) {
					if(p.cean.equalsIgnoreCase(pesquisa)) {
						verificar = true;
						sayln("Produto encontrado!");
						
						sayln("CEAN: " + p.cean);
						sayln("Nome: " + p.nome);
						sayln("Marca: " + p.marca);
						sayln("Valor: " + p.valor);
						System.out.println("\nEscolha o imposto para verificar:");
	                      System.out.println("1 - Total");
	                      System.out.println("2 - ICMS");
	                      System.out.println("3 - IPI");
	                      System.out.println("4 - PIS");
	                      System.out.println("5 - COFINS");
	                      System.out.print("Opção: ");
	                      int escolhaImp = sc.nextInt();

	                      switch (escolhaImp) {
	                          case 1:
	                              p.calcularImpostoTotal();
	                              break;
	                          case 2:
	                              p.calcularIcms();
	                              break;
	                          case 3:
	                              p.calcularIpi();
	                              break;
	                          case 4:
	                              p.calcularPis();
	                              break;
	                          case 5:
	                              p.calcularCofins();
	                              break;
	                          default:
	                              System.out.println("Opção inválida!");
	                      }
	                      break;         
	                      
					}
				}
				if (!verificar) {
                    System.out.println("Produto não encontrado!");
                }

            } else if (opc == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
				
		}
		sc.close();
	}
	
}
