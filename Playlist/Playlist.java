// Classe que gerencia a playlist
public class Playlist {
    private MusicaNode head; // Referência para o início da lista
    private MusicaNode musicaAtual; // Referência para a música que está "tocando"

    // Construtor: inicializa uma playlist vazia
    public Playlist() {
        this.head = null;
        this.musicaAtual = null;
    }

    // --- MÉTODOS JÁ IMPLEMENTADOS ---

    // Adiciona uma nova música no FINAL da playlist
    public void adicionarMusica(String titulo, String artista, int duracao) {
        MusicaNode novaMusica = new MusicaNode(titulo, artista, duracao);
        if (head == null) {
            head = novaMusica;
        } else {
            MusicaNode atual = head;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novaMusica;
        }
        System.out.println("Musica '" + titulo + "' adicionada.");
    }

    // Remove uma música da playlist pelo título
    public void removerMusica(String titulo) {
        if (head == null) {
            System.out.println("Playlist vazia, nada a remover.");
            return;
        }

        // Caso especial: o nó a ser removido é a cabeça da lista
        // Em Java, usamos .equals() para comparar strings
        if (head.titulo.equals(titulo)) {
            head = head.proximo;
            // O Garbage Collector do Java cuidará de limpar a memória do nó antigo
            System.out.println("Musica '" + titulo + "' removida.");
            return;
        }

        MusicaNode anterior = head;
        MusicaNode atual = head.proximo;
        while (atual != null && !atual.titulo.equals(titulo)) {
            anterior = atual;
            atual = atual.proximo;
        }

        if (atual == null) {
            System.out.println("Musica '" + titulo + "' nao encontrada na playlist.");
        } else {
            anterior.proximo = atual.proximo;
            System.out.println("Musica '" + titulo + "' removida.");
        }
    }

    // Exibe todas as músicas da playlist
    public void exibirPlaylist() {
        if (head == null) {
            System.out.println("A playlist esta vazia.");
            return;
        }
        System.out.println("--- MINHA PLAYLIST ---");
        MusicaNode atual = head;
        int index = 1;
        while (atual != null) {
            System.out.println(index++ + ". " + atual.titulo + " - " 
                               + atual.artista + " (" + atual.duracao / 60 + "m" 
                               + atual.duracao % 60 + "s)");
            atual = atual.proximo;
        }
        System.out.println("---------------------");
    }

    
   
    public void tocarProxima() {
        if(this.head == null){
            System.out.println("A playlist nao existe!");
            return;
        }
        if(this.musicaAtual == null){
            this.musicaAtual = this.head;
            System.out.println("Playlist iniciada!");
            System.out.println("Tocando: " + this.musicaAtual.titulo);
            return;
        }
        if(this.musicaAtual.proximo == null){
            this.musicaAtual = this.head;
            System.out.println("Playlist reiniciada!");
            System.out.println("Tocando: " + this.musicaAtual.titulo);
            return;
        }
        
        this.musicaAtual = this.musicaAtual.proximo;
        System.out.print("Next =>  ");
        System.out.println("Tocando: " + this.musicaAtual.titulo);
        
    }

    /*
     * OBJETIVO 2: Reorganizar a playlist.
     * Encontrar a música com o 'titulo' fornecido e movê-la para a 'novaPosicao'.
     * As posições começam em 1. Ex: novaPosicao = 1 significa mover para o início.
     * Lembre-se de tratar os casos especiais:
     * - Mover o primeiro elemento.
     * - Mover para a primeira posição.
     * - Mover para a última posição.
     * - Posição inválida ou música não encontrada.
     * Dica: Você precisará de referências para o nó anterior ao que será movido
     * e para o nó anterior à nova posição.
    */
    public void moverMusica(String titulo, int novaPosicao) {
        if(this.head == null){
            System.out.println("A playlist nao existe!");
            return;
        }
        
       if(novaPosicao < 1){
            System.out.println("Posicao inválida!!");
            return;
       }
       
       MusicaNode musicaDesejada = this.head;
       MusicaNode anteriorMusica = null;
       int pos = 1;
       while(musicaDesejada != null && !musicaDesejada.titulo.equals(titulo)){
            anteriorMusica = musicaDesejada;
            musicaDesejada = musicaDesejada.proximo;
            pos ++;
       }
       
       if(musicaDesejada == null){
           System.out.println("A musica " + titulo + " nao foi encontrada!");
           return;
       }
       
       
       if(novaPosicao == 1){
            if(anteriorMusica != null){
               anteriorMusica.proximo = musicaDesejada.proximo;
            }else{
               head = musicaDesejada.proximo;
            }
            
            musicaDesejada.proximo = head;
            head = musicaDesejada;
            
            System.out.println("A musica foi movida para o inicio com sucesso!!");
            return;
       }

       
       
       
       if(pos == novaPosicao){
            System.out.println("A musica ja esta na posicao desejada!!");
            return;
       }
       
       MusicaNode atual = this.head;
       MusicaNode anterior = null;
       int contador = 1;
       
       while(atual != null && contador < novaPosicao){
            anterior = atual;
            atual = atual.proximo;
            contador ++;
       }
       
       if (anteriorMusica != null) {
        anteriorMusica.proximo = musicaDesejada.proximo;
       } else {
           head = musicaDesejada.proximo;
       }       
       
       anterior.proximo = musicaDesejada;
       musicaDesejada.proximo = atual;
    }

    /*
     * OBJETIVO 3 (BÔNUS): Inverter a ordem de toda a playlist.
     * O último elemento deve se tornar o primeiro, o penúltimo o segundo, e assim por diante.
     * Tente fazer isso "in-place", ou seja, sem criar uma nova lista,
     * apenas manipulando as referências 'proximo' dos nós existentes.
     * Dica: Você precisará de três referências: 'anterior', 'atual' e 'proximo'.
    */
    public void inverterPlaylist() {
        // SUA IMPLEMENTAÇÃO AQUI
        System.out.println("Funcionalidade 'inverterPlaylist' ainda nao implementada.");
    }
}