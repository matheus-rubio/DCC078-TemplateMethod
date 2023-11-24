package com.dcc.ufjf;

public class ProdutoEletronico extends Produto {

    public ProdutoEletronico(String nome, double preco) {
        super(nome, preco);
    }

    public String verificarSeEstaEmUmValorJusto() {
        if(this.preco > 1000)
            return "Caríssimo";
        else if(this.preco > 500)
            return "Acima do normal";
        else
            return "Preço justo";
    }
}
