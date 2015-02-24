package br.com.ricardolonga;

public class Pedido {

    private enum Status { NOVO, PROCESSADO, ENVIADO };
    
    private Status status = Status.NOVO;

    public void processar() {
        switch (status) {
            case NOVO:
                status = Status.PROCESSADO;
                System.out.println("Processando o pedido... pedido processado!");
                break;
            case PROCESSADO:
                throw new IllegalStateException("Este pedido já foi processado.");
            case ENVIADO:
                throw new IllegalStateException("Este pedido já foi enviado.");
        }
    }
    
    public void enviar() {
        switch (status) {
            case NOVO:
                throw new IllegalStateException("Este pedido ainda não foi processado.");
            case PROCESSADO:
                status = Status.ENVIADO;
                System.out.println("Enviando o pedido... pedido enviado!");
                break;
            case ENVIADO:
                throw new IllegalStateException("Este pedido já foi enviado.");
        }        
    }
        
}
