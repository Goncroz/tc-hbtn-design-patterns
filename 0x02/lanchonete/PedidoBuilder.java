public class PedidoBuilder extends PedidoAbstractBuilder {

    private Pedido pedido;
    ItemPedido itemPedido;
    TipoLanche tipoLanche;
    TipoItemPedido tipoItemPedido;
    TamanhoBatata tamanhoBatata;
    TipoBrinde tipoBrinde;
    TipoBebida tipoBebida;

    @Override
    public void setLanche(TipoLanche tipo) {
        tipoLanche = tipo;
    }

    @Override
    public void setBatata(TamanhoBatata tamanho) {
        tamanhoBatata = tamanho;
    }

    @Override
    public void setBrinde(TipoBrinde tipo) {
        tipoBrinde = tipo;
    }

    @Override
    public void setBebida(TipoBebida tipo) {
        tipoBebida = tipo;
    }

    public Pedido build(){

        return new Pedido(tipoLanche, tamanhoBatata, tipoBrinde, tipoBebida);
    }

}
