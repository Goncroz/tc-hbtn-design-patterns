public class PedidoBuilder extends PedidoAbstractBuilder {
    private Pedido pedido;
    private ItemPedido itemPedido = new ItemPedido();

    @Override
    void setLanche(TipoLanche tipo) {
        itemPedido.setTipo(TipoItemPedido.LANCHE);
        itemPedido.setNome(tipo.name());
        pedido.adicionarItemDentroCaixa(itemPedido);
    }

    @Override
    void setBatata(TamanhoBatata tamanho) {
        itemPedido.setTipo(TipoItemPedido.BATATA);
        itemPedido.setNome(tamanho.name());
        pedido.adicionarItemDentroCaixa(itemPedido);
    }

    @Override
    void setBrinde(TipoBrinde tipo) {
        itemPedido.setTipo(TipoItemPedido.BRINDE);
        itemPedido.setNome(tipo.name());
        pedido.adicionarItemDentroCaixa(itemPedido);
    }

    @Override
    void setBebida(TipoBebida tipo) {
        itemPedido.setTipo(TipoItemPedido.BRINDE);
        itemPedido.setNome(tipo.name());
        pedido.adicionarItemForaCaixa(itemPedido);
    }

    public Pedido build(){
        return pedido;
    }

}
