public class Main{
   public static void main(String[] args){
      ListaPessoas lista = new ListaPessoas();
      
      lista.imprimirPessoas();
      
      lista.adicionarNoFinal("Gabriel", 19);
      lista.adicionarNoFinal("Lucas", 23);
      lista.adicionarNoFinal("Marcus", 21);
      lista.adicionarNoFinal("Renata", 54);
      lista.exibirTamanho();
      lista.imprimirPessoas();
      lista.adicionarNoInicio("Thiago", 25); 
      lista.imprimirPessoas();
      lista.adicionarNoInicio("Otavio", 20);
      lista.imprimirPessoas();
      lista.adicionarNoFinal("Joao", 25);
      lista.imprimirPessoas();
      lista.removerPorNome("j");
      lista.removerPorNome("Otavio");
      lista.imprimirPessoas();
      lista.removerPorNome("Joao");
      lista.imprimirPessoas();
      lista.exibirTamanho();
      lista.pesquisarPorNome("t");
      lista.pesquisarPorNome("Thiago");
      lista.pesquisarPorNome("Lucas");
      lista.inserirPorIndice(2, "Jack", 3);
      lista.imprimirPessoas();
      lista.apagarLista();
      lista.imprimirPessoas();
      lista.adicionarNoFinal("Gabriel", 19);
      lista.adicionarNoFinal("Lucas", 23);
      lista.adicionarNoFinal("Marcus", 21);
      lista.adicionarNoFinal("Renata", 54);
      lista.exibirTamanho();
      lista.imprimirPessoas();
      lista.adicionarNoInicio("Thiago", 25); 
      lista.imprimirPessoas();
      lista.adicionarNoInicio("Otavio", 20);
      lista.imprimirPessoas();
      lista.adicionarNoFinal("Joao", 25);
      lista.imprimirPessoas();
      lista.removerPorNome("j");
      lista.removerPorNome("Otavio");
      lista.imprimirPessoas();
      lista.inserirPorIndice(2, "Jack", 3);
      lista.imprimirPessoas();
      lista.ordenarPorIdade();
      lista.imprimirPessoas();
      
   }
}