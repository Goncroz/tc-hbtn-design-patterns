import java.util.ArrayList;
import java.util.List;

public class BebidaComLeite extends BebidaDecorator{

    public BebidaComLeite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }
    @Override
    public List<String> obterIngredientes() {
        List<String> leite = super.obterIngredientes();
        leite.add("leite");
        return leite;
    }
    @Override
    public double obterPreco(){
        double valor = super.obterPreco() + 3.2;
        return valor;
    }
}
