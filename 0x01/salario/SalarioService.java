public class SalarioService {
    private CalculadorSalarioService calculador = CalculadorSalarioService.getCalculadorSalarioService();

    public double calcular(double salarioBruto, double valorDescontos, double valorVendas, double percentualComissao){
        return  calculador.calcularSalarioLiquido(salarioBruto, valorDescontos, valorVendas, percentualComissao);

    }

    public java.util.UUID getUuid(){
        return calculador.uuid;
    }
}
