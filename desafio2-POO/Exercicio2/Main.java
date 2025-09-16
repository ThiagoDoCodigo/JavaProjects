import java.util.Scanner;
import java.time.LocalDate;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("================================");
      System.out.print("Digite o nome: ");
      String nome = sc.nextLine();

      System.out.print("Digite o dia de nascimento: ");
      int dia = sc.nextInt();

      System.out.print("Digite o mês de nascimento: ");
      int mes = sc.nextInt();

      System.out.print("Digite o ano de nascimento: ");
      int ano = sc.nextInt();
      System.out.println("================================\n");

      Pessoa novaPessoa = new Pessoa(nome, dia, mes, ano);
      
      //Pesquisei como pega a data do sistema automaticamente aqui ao inves de perguntar ao usuario
      LocalDate dataAtual = LocalDate.now();
      int diaAtual = dataAtual.getDayOfMonth();
      int mesAtual = dataAtual.getMonthValue();
      int anoAtual = dataAtual.getYear();

      novaPessoa.calcularIdade(diaAtual, mesAtual, anoAtual);

      
      System.out.println("================================");
      System.out.println("Dados: ");
      novaPessoa.exibirPessoa();
      System.out.println("================================\n");
   
      sc.close();
   }
}
