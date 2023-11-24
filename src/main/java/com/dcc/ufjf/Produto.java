package com.dcc.ufjf;

public abstract class Produto {

    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public abstract String verificarSeEstaEmUmValorJusto();

    public String getTipo() {
        if(this instanceof ProdutoEletronico)
            return "Eletronico";
        else if(this instanceof ProdutoEsportivo)
            return "Esportivo";
        else
            return "Produto";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "nome='" + this.nome + '\'' +
                ", preco=" + this.preco +
                ", avaliacaoDoValor=" + this.verificarSeEstaEmUmValorJusto() +
                '}';
    }
}
