public class Impressao {
    private int paginasTotais;
    private int paginasColoridas;
    private int paginasPretoBranco;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;
    private TamanhoImpressao tamanhoImpressao;
    private double valorTotalImpressao;


    public Impressao() {
    }

    public Impressao(TamanhoImpressao tamanhoImpressao, int totalPaginas, int quantidadePaginasColoridas, boolean ehFrenteVerso) {
        this.tamanhoImpressao = tamanhoImpressao;
        this.paginasTotais = totalPaginas;
        this.paginasColoridas = quantidadePaginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
        this.paginasPretoBranco = totalPaginas - quantidadePaginasColoridas;
    }

    public int getPaginasTotais() {
        return paginasTotais;
    }

    public void setPaginasTotais(int paginasTotais) {
        this.paginasTotais = paginasTotais;
    }

    public int getPaginasColoridas() {
        return paginasColoridas;
    }

    public void setPaginasColoridas(int paginasColoridas) {
        this.paginasColoridas = paginasColoridas;
    }

    public int getPaginasPretoBranco() {
        return paginasPretoBranco;
    }

    public void setPaginasPretoBranco(int paginasPretoBranco) {
        this.paginasPretoBranco = paginasPretoBranco;
    }

    public boolean isEhFrenteVerso() {
        return ehFrenteVerso;
    }

    public void setEhFrenteVerso(boolean ehFrenteVerso) {
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public double getValorColoridasFrenteVerso() {
        return valorColoridasFrenteVerso;
    }

    public void setValorColoridasFrenteVerso(double valorColoridasFrenteVerso) {
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
    }

    public double getValorPretoBrancoFrenteVerso() {
        return valorPretoBrancoFrenteVerso;
    }

    public void setValorPretoBrancoFrenteVerso(double valorPretoBrancoFrenteVerso) {
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
    }

    public double getValorColoridasFrenteApenas() {
        return valorColoridasFrenteApenas;
    }

    public void setValorColoridasFrenteApenas(double valorColoridasFrenteApenas) {
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
    }

    public double getValorPretoBrancoFrenteApenas() {
        return valorPretoBrancoFrenteApenas;
    }

    public void setValorPretoBrancoFrenteApenas(double valorPretoBrancoFrenteApenas) {
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    public double calcularTotal(double valorTotalImpressao){

        if (ehFrenteVerso){
            if (tamanhoImpressao.equals(TamanhoImpressao.A2)){
                valorColoridasFrenteVerso = 0.18;
                valorPretoBrancoFrenteVerso = 0.28;
                valorTotalImpressao = valorTotalImpressao + paginasColoridas * valorColoridasFrenteVerso;
                valorTotalImpressao = valorTotalImpressao + paginasPretoBranco * valorPretoBrancoFrenteVerso;
            }
            if (tamanhoImpressao.equals(TamanhoImpressao.A3)){
                valorColoridasFrenteVerso = 0.15;
                valorPretoBrancoFrenteVerso = 0.25;
                valorTotalImpressao = valorTotalImpressao + paginasColoridas * valorColoridasFrenteVerso;
                valorTotalImpressao = valorTotalImpressao + paginasPretoBranco * valorPretoBrancoFrenteVerso;
            }
            if (tamanhoImpressao.equals(TamanhoImpressao.A4)){
                valorColoridasFrenteVerso = 0.10;
                valorPretoBrancoFrenteVerso = 0.20;
                valorTotalImpressao = valorTotalImpressao + paginasColoridas * valorColoridasFrenteVerso;
                valorTotalImpressao = valorTotalImpressao + paginasPretoBranco * valorPretoBrancoFrenteVerso;
            }
        }
        else{
            if (tamanhoImpressao.equals(TamanhoImpressao.A2)){
                valorColoridasFrenteApenas = 0.22;
                valorPretoBrancoFrenteApenas = 0.32;
                valorTotalImpressao = valorTotalImpressao + paginasColoridas * valorColoridasFrenteApenas;
                valorTotalImpressao = valorTotalImpressao + paginasPretoBranco * valorPretoBrancoFrenteApenas;
            }
            if (tamanhoImpressao.equals(TamanhoImpressao.A3)){
                valorColoridasFrenteApenas = 0.20;
                valorPretoBrancoFrenteApenas = 0.30;
                valorTotalImpressao = valorTotalImpressao + paginasColoridas * valorColoridasFrenteApenas;
                valorTotalImpressao = valorTotalImpressao + paginasPretoBranco * valorPretoBrancoFrenteApenas;
            }
            if (tamanhoImpressao.equals(TamanhoImpressao.A4)){
                valorColoridasFrenteApenas = 0.15;
                valorPretoBrancoFrenteApenas = 0.25;
                valorTotalImpressao = valorTotalImpressao + paginasColoridas * valorColoridasFrenteApenas;
                valorTotalImpressao = valorTotalImpressao + paginasPretoBranco * valorPretoBrancoFrenteApenas;
            }
        }
        return valorTotalImpressao;
    }

    @Override
    public String toString() {

        String y;
        if (ehFrenteVerso){
            y = "frente e verso.";
        }
        else{
            y = "frente apenas.";
         }

        return "total de paginas: " + paginasTotais +
                ", total coloridas: " + paginasColoridas +
                ", total preto e branco: " + paginasPretoBranco +
                ", " + y + " total: R$ " +
                String.format("%.2f", calcularTotal(valorTotalImpressao));
    }
}
