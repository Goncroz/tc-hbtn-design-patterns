import java.util.HashSet;

public class Pedido {
    private HashSet<ItemPedido> itensDentroCaixa;
    private HashSet<ItemPedido> itensForaCaixa;

    public void adicionarItemDentroCaixa(ItemPedido item){
        itensDentroCaixa.add(item);
    }
    public void adicionarItemForaCaixa(ItemPedido item){
        itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "itensDentroCaixa=" + itensDentroCaixa +
                ", itensForaCaixa=" + itensForaCaixa +
                '}';
    }
}
