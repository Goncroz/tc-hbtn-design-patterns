import java.util.ArrayList;
import java.util.List;

public class BebidaComAcucar extends BebidaDecorator{


    public BebidaComAcucar(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }
    @Override
    public List<String> obterIngredientes() {
        List<String> acucar = super.obterIngredientes();
        acucar.add("acucar");
        return acucar;
    }
    @Override
    public double obterPreco(){
        double valor = super.obterPreco() + 1.9;
        return valor;
    }
}
