public class ListaPessoas{
   //Aqui eu to declarando uma variavel do tipo PessoaComNo, que guardará o primeiro objeto enserido na lista
   PessoaComNo cabeca;
   
   //Construtor, igual em todas classes
   public ListaPessoas(){
      this.cabeca = null;
   }
   
   
   //Metodo para adicionar Pessoas na classe PessoaComNo
   public void adicionar(String nome, int idade){
      //Aqui eu to criando uma nova instancia ou objeto da classe PessoaComNo
      //Utilizo os valores que vem do main(nome,idade) para enviar como parametro
      PessoaComNo novaPessoa = new PessoaComNo(nome, idade);
      
      //Esse if so vai cair nele no primeiro objeto enserido
      //Como a variavel cabeca ainda é null, a novaPessoa criada vai ser a cabeca
      //A cabeca é o ponteiro, ou seja, de onde começa a lista
      if(cabeca == null){
         cabeca = novaPessoa;
      }else{
         //Aqui vai cair em todos os outros(segundo pra frente)
         //Crio essa variavel do tipo PessoaComNo chamada atual e guardo nela a cabeca(primeiro da lista)
         PessoaComNo atual = cabeca;
         
         //primeiro e segundo caso     
         //quando eu adicionar o primeiro, exemplo: Thiago, ele sera o cabeca da lista
         //porem ainda nao vai ta preenchido o proximo, so na proxima chamada do metodo adicionar
         //Adicionei Thiago, se depois eu for adicionar o joão, o proximo de Thiago ainda vai ser null
         //Logo, nao entrará no while, entao o atual vai continuar sendo Thiago, entao a novaPessoa(João) vai ser adicionada de proximo em Thiago
         
         //Terceiro caso, adicionando o Rossandre
         //Tendo Thiago como cabeca e Thiago tendo proximo o João, logo, Atual.proximo nao sera null
         //Nesse sentido, o atual vai ser subscrito pelo proximo do atual, no caso Thiago é atual e tem proximo o João
         //Entao o atual sera o João, e no atual.proximo do joão, iremos adicionar a nova pessoa(Rossandre)
         while(atual.proximo != null){
            atual = atual.proximo;
         }
         atual.proximo = novaPessoa;
      }
   }
   
   public void imprimir(){
      PessoaComNo atual = cabeca;
      
      while(atual != null){
         System.out.print("Nome: " + atual.nome + "  |  Idade:" + atual.idade + "  =>  ");
         atual = atual.proximo;
      }
      System.out.print("Final");
   }
}