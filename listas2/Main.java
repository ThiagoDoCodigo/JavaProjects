public class Main{
   public static void main(String[] args){
      //Aqui estou declarando uma variavel do tipo ListaPessoas chamada lista
      //Estou guardando nesta variável uma nova instancia da classa ListaPessoas
      ListaPessoas lista = new ListaPessoas();
      
      
      //Estou usando o metodo adicionar, dentro da classe ListaPessoas, enviando o nome e idade
      lista.adicionar("Thiago", 25);
      lista.adicionar("Gabriel", 18);
      lista.adicionar("Marcus", 21);
      
      
      //Aqui estou chamando o metodo imprimir dentro da classe ListaPessoas
      lista.imprimir();
           
   }
}