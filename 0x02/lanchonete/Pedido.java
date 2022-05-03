import java.util.HashSet;

public class Pedido {
    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();

   public Pedido(TipoBebida tipoBebida, TipoBrinde tipoBrinde, TamanhoBatata tamanhoBatata, TipoLanche tipoLanche) {




        public Pedido(TipoLanche tipoLanche, TamanhoBatata tamanhoBatata, TipoBrinde tipoBrinde, TipoBebida tipoBebida) {
        if (tipoBebida != null) {
            ItemPedido bebida = new ItemPedido(TipoItemPedido.BEBIDA, tipoBebida.name());
            adicionarItemForaCaixa(bebida);
        }
        if (tamanhoBatata != null) {
            ItemPedido batata = new ItemPedido(TipoItemPedido.BATATA, tamanhoBatata.name());
            adicionarItemDentroCaixa(batata);
        }
        if (tipoBrinde != null) {
            ItemPedido brinde = new ItemPedido(TipoItemPedido.BRINDE, tipoBrinde.name());
            adicionarItemDentroCaixa(brinde);
        }
        if (tipoLanche != null) {
            ItemPedido lanche = new ItemPedido(TipoItemPedido.LANCHE, tipoLanche.name());
            adicionarItemDentroCaixa(lanche);
        }
    }

    public void adicionarItemDentroCaixa(ItemPedido item) {
        itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item) {
        itensForaCaixa.add(item);
    }

    public Pedido(HashSet<ItemPedido> itensDentroCaixa, HashSet<ItemPedido> itensForaCaixa) {
        this.itensDentroCaixa = itensDentroCaixa;
        this.itensForaCaixa = itensForaCaixa;
    }

//    public HashSet<ItemPedido> getItensDentroCaixa() {
//        return itensDentroCaixa;
//    }
//
//    public HashSet<ItemPedido> getItensForaCaixa() {
//        return itensForaCaixa;
//    }

    @Override
    public String toString() {

        String result1 = "";

        result1 += "\tFora da Caixa:\n";

        for (ItemPedido item : itensForaCaixa) {
            result1 += String.format("\t\t- %s %s\n", item.getTipo(), item.getNome());
        }

        String result2 = "";

        result2 += "\tDentro da Caixa:\n";

        for (ItemPedido item : itensDentroCaixa) {
            result2 += String.format("\t\t- %s %s\n", item.getTipo(), item.getNome());
        }

        return result1 + result2;
    }
}
