package com.dcc.ufjf;

public class ProdutoEsportivo extends Produto {

    public ProdutoEsportivo(String nome, double preco) {
        super(nome, preco);
    }

    public String verificarSeEstaEmUmValorJusto() {
        if(this.preco > 250)
            return "Caríssimo";
        else if(this.preco > 200)
            return "Acima do normal";
        else
            return "Preço justo";
    }
}

