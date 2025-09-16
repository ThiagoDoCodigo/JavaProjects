public class Main{
   public static void main(String[] args){
      ListaPessoas lista = new ListaPessoas();
      
      lista.imprimirLista();
      lista.removerCabeca();
      lista.adicionarNoFinal("Thiago");
     
      lista.adicionarNoFinal("Gabriel");
      lista.adicionarNoFinal("Marcus");
      lista.removerCabeca();
      lista.adicionarNoFinal("Lucas");
      lista.imprimirLista();
      lista.adicionarNoInicio("Renata");
      lista.adicionarNoInicio("Thiago");
      lista.imprimirLista();
      lista.excluirPorNome("Lucas");
      lista.excluirPorNome("Luca");
      lista.imprimirLista();
      lista.excluirPorNome("Gabriel");
      lista.excluirPorNome("Luca");
      lista.imprimirLista();
   }
}