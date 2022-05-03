public class ImpressaoFactory {
    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int totalPaginas, int quantidadePaginasColoridas, boolean ehFrenteVerso){
        Impressao impressao = new Impressao(tamanhoImpressao,
                                            totalPaginas,
                                            quantidadePaginasColoridas,
                                            ehFrenteVerso);
        return impressao;
    }
}
