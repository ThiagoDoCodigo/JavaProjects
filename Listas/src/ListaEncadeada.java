
public class ListaEncadeada {
	PessoaComNo cabeca;
	
	public ListaEncadeada() {
		this.cabeca = null;
	}
	
	public void adicionar(String text) {
		PessoaComNo novaPessoa = new PessoaComNo(text);
		
		if(cabeca == null) {
			cabeca = novaPessoa;
		}else {
			PessoaComNo atual = cabeca;
			while(atual.proximo != null) {
				atual = atual.proximo;
			}
			atual.proximo = novaPessoa;
		}
	}
	
	  public void imprimir() {
		  PessoaComNo atual = cabeca;
	        while (atual != null) {
	            System.out.print(atual.nome + " -> ");
	            atual = atual.proximo;
	        }
	        System.out.println("Final");
	    }
	
}
