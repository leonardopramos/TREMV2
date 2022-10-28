public class Lista {
    private Nodo inicio;
    private Nodo fim;
    private int quantidade;

    public Lista(){
        this.inicio = null;
        this.fim = null;
        this.quantidade = 0;
    }

    public void adicionar(Veiculo veiculo){
        Nodo nodo = new Nodo(veiculo);
        this.quantidade++;
        if(this.inicio == null){
            this.inicio = nodo;
            this.fim = nodo;
            return;
        }
        Nodo oldTail = this.fim;
        this.fim = nodo;
        oldTail.proximo = this.fim;
    }

    public void adicionar(Veiculo veiculo, int posicao){
        if(posicao < 0 || posicao >= this.quantidade){
            throw new IndexOutOfBoundsException();
        }
        Nodo nodo = new Nodo(veiculo);
        if(posicao == 0){
            nodo.proximo = this.inicio;
            this.inicio = nodo;
            this.quantidade++;
            return;
        }

        if(posicao == this.quantidade - 1){
            this.adicionar(veiculo);
            return;
        }

        Nodo aux = this.inicio;
        for(int i = 0; i < posicao - 1; i++){
            aux = aux.proximo;
        }
        nodo.proximo = aux.proximo;
        aux.proximo = nodo;
        this.quantidade++;
        return;
    }

    public Veiculo removePelaPosicao(int index){
        Nodo aux = this.inicio;
        Nodo element;
        if(index == 0){
            this.inicio = aux.proximo;
            element = aux;
            aux = null;
            this.quantidade--;
            return element.veiculo;
        }
        for(int i = 0; i < index - 1; i++){
            aux = aux.proximo;
        }
        this.quantidade--;
        element = aux.proximo;
        aux.proximo = aux.proximo.proximo;
        return element.veiculo;
    }

    public Veiculo remove(Veiculo v){
        int index = this.retornaPosicao(v);
        return this.removePelaPosicao(index);
    }

    public int tamanho(){
        return this.quantidade;
    }

    public Veiculo get(int index){
        Nodo aux = this.inicio;
        for(int i = 0; i < index; i++){
            aux = aux.proximo;
        }
        return aux.veiculo;
    }

    public int retornaPosicao(Veiculo v){
        int index = 0;
        Nodo aux = this.inicio;
        while(true){
            if(aux == null){
                return -1;
            }

            if(aux.veiculo == v){
                break;
            }

            aux = aux.proximo;
            index++;
        }

        return index;
    }

    public boolean vazia(){
        return this.quantidade == 0;
    }

    public boolean contains(Veiculo v){
        Nodo aux = this.inicio;
        while(true){
            if(aux == null){
                return false;
            }

            if(aux.veiculo == v){
                break;
            }

            aux = aux.proximo;
        }

        return true;
    }

    public void override(int index, Veiculo v){
        Nodo aux = this.inicio;
        for(int i = 0; i < index; i++){
            aux = aux.proximo;
        }
        aux.veiculo = v;
    }

    public void limpa(){
        Nodo aux = this.inicio;
        while(true){
            if(aux == null){
                break;
            }
            this.remove(aux.veiculo);
            aux = aux.proximo;
        }
    }

    @Override
    public String toString() {
        String aux = "[ ";
        Nodo paux = inicio;
        while (paux != null) {
            aux = aux + paux.veiculo + " ";
            paux = paux.proximo; // avanca para proximo novo
        }
        aux += "]";
        return aux;
    }
}