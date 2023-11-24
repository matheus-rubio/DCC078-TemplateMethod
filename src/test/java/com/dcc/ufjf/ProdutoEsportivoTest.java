package com.dcc.ufjf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProdutoEsportivoTest {
    
        @Test
        void deveRetornarValorCarissimo() {
            ProdutoEsportivo produto = new ProdutoEsportivo("Bicicleta", 251.00);
            assertEquals("Esportivo{nome='Bicicleta', preco=251.0, avaliacaoDoValor=Caríssimo}", produto.getInfo());
        }
    
        @Test
        void deveRetornarValorAcima() {
            ProdutoEsportivo produto = new ProdutoEsportivo("Bicicleta", 200.01);
            assertEquals("Esportivo{nome='Bicicleta', preco=200.01, avaliacaoDoValor=Acima do normal}", produto.getInfo());
        }
    
        @Test
        void deveRetornarValorJusto() {
            ProdutoEsportivo produto = new ProdutoEsportivo("Bicicleta", 199.99);
            assertEquals("Esportivo{nome='Bicicleta', preco=199.99, avaliacaoDoValor=Preço justo}", produto.getInfo());
        }
}

