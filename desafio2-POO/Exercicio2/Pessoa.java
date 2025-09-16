public class Pessoa {
   private String nome;
   private int dia;
   private int mes;
   private int ano;
   private int idade;

   public Pessoa(String nome, int dia, int mes, int ano) {
      this.nome = nome;
      this.dia = dia;
      this.mes = mes;
      this.ano = ano;
      this.idade = 0;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public void setDia(int dia) {
      if (dia > 30 || dia < 1) {
         System.out.println("Dia invalido!");
         return;
      }
      this.dia = dia;
   }

   public void setMes(int mes) {
      if (mes > 12 || mes < 1) {
         System.out.println("Mees invalido!");
         return;
      }
      this.mes = mes;
   }

   public void setAno(int ano) {
      if (ano > 2025 || ano < 1900) {
         System.out.println("Ano invalido!!");
         return;
      }
      this.ano = ano;
   }

   public void setIdade(int idade) {
      this.idade = idade;
   }

   public String getNome() {
      return this.nome;
   }

   public int getDia() {
      return this.dia;
   }

   public int getMes() {
      return this.mes;
   }

   public int getAno() {
      return this.ano;
   }

   public int getIdade() {
      return this.idade;
   }

   public void calcularIdade(int diaAtual, int mesAtual, int anoAtual) {
      int idadeCalculada = anoAtual - this.ano;

      if (mesAtual < this.mes || (mesAtual == this.mes && diaAtual < this.dia)) {
         idadeCalculada--;
      }

      this.idade = idadeCalculada;
   }
   
   public void exibirPessoa() {
      System.out.println("Nome: " + nome);
      System.out.println("Data de nascimento: " + dia + "/" + mes + "/" + ano);
      System.out.println("Idade: " + idade);
   }
}
