package com.dcc.ufjf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProdutoEletronicoTest {

    @Test
    void deveRetornarValorCarissimo() {
        ProdutoEletronico produto = new ProdutoEletronico("SSD 500GB", 1000.01);
        assertEquals("Eletronico{nome='SSD 500GB', preco=1000.01, avaliacaoDoValor=Caríssimo}", produto.getInfo());
    }

    @Test
    void deveRetornarValorAcima() {
        ProdutoEletronico produto = new ProdutoEletronico("SSD 500GB", 500.01);
        assertEquals("Eletronico{nome='SSD 500GB', preco=500.01, avaliacaoDoValor=Acima do normal}", produto.getInfo());
    }

    @Test
    void deveRetornarValorJusto() {
        ProdutoEletronico produto = new ProdutoEletronico("SSD 500GB", 499.99);
        assertEquals("Eletronico{nome='SSD 500GB', preco=499.99, avaliacaoDoValor=Preço justo}", produto.getInfo());
    }
}

