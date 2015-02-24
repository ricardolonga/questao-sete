package br.com.ricardolonga;

import java.util.Arrays;

/**
 * Observe a complexidade de adicionar o evento "cancelar" e o status CANCELADO.
 * Estamos violando o princípio OCP pois para estender o sistema é necessário alterar as classes já prontas.
 */
public class Aplicacao {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        
//        pedido.enviar();
        
        pedido.processar();
        pedido.enviar();
        pedido.processar();
    }

}


