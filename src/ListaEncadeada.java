public class ListaEncadeada<T> {
    private No<T> inicio;
    private Integer tamanho = 0;

    //Adcionar no final da lista
    public void adicionar(T elemento) {
        this.inicio = adicionarRec(this.inicio, elemento);
        tamanho++;
    }
    //logica de adcionar
    private No<T> adicionarRec(No<T> atual, T elemento) {
        if (atual == null) {
            return new No<>(elemento);
        } else {
            atual.setProximo(adicionarRec(atual.getProximo(), elemento));
            return atual;
        }
    }

    public void adicionarNaPosicao(int posicao, T elemento) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida!");
        }
        this.inicio = adicionarNaPosicaoRec(this.inicio, posicao, elemento, 0);
        tamanho++;
    }

    private No<T> adicionarNaPosicaoRec(No<T> atual, int posicao, T elemento, int indiceAtual) {
        if (posicao == 0) {
            No<T> novoNo = new No<>(elemento);
            novoNo.setProximo(atual);
            return novoNo;
        } else {
            atual.setProximo(adicionarNaPosicaoRec(atual.getProximo(), posicao - 1, elemento, indiceAtual + 1));
            return atual;
        }
    }



    //listar
    public String listar(){
        StringBuilder builder = new StringBuilder("[");
        listarRec(this.inicio,builder);
        builder.append("]");
        return builder.toString();
    }

    //logica de listar
    private void listarRec(No<T> atual, StringBuilder builder){
        if (atual != null){
            builder.append(atual.getElemento());
            builder.append(" ");
            listarRec(atual.getProximo(),builder);
        }

    }

    //limpar lista
    public void limparList(){
        this.inicio = limparListaRec(this.inicio);
        this.tamanho = 0;
    }

    //logica de limpar lista
    private No<T> limparListaRec(No<T> atual){
        if (atual == null){
            return null;
        }else {
            No<T> proximo = atual.getProximo();
            atual.setProximo(null);
            this.tamanho--;
            return limparListaRec(proximo);
        }
    }

    // remover determinado elemento da lista
    public void remover(T elemento) {
        this.inicio = removerRec(this.inicio, elemento);
        if (this.inicio != null) {
            this.tamanho--;
        }
    }

    //logica do metodo remover
    private No<T> removerRec(No<T> atual, T elemento) {
        if (atual == null) {
            return null;
        } else if (atual.getElemento().equals(elemento)) {
            return atual.getProximo();
        } else {
            atual.setProximo(removerRec(atual.getProximo(), elemento));
            return atual;
        }
    }

    public No<T> last() {
        if (inicio == null) {
            return null; // lista vazia
        }
        return lastRec(inicio);
    }

    private No<T> lastRec(No<T> atual) {
        if (atual.getProximo() == null) {
            return atual; // último nó encontrado
        } else {
            return lastRec(atual.getProximo());
        }
    }


    public No<T> next(){
        return this.inicio.getProximo();
    }

    // Ver o tamanho da lista
    public Integer getTamanho() {
        return this.tamanho;
    }

}
