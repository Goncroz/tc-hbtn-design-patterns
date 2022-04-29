public class Ladrao extends Personagem{

    public Ladrao() {
        super();
    }
    public Ladrao(String nome, TipoPersonagem tipo, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super(  nome,
                tipo,
                inteligencia,
                forca,
                vigor,
                resistencia,
                destreza);


            if (destreza < inteligencia || destreza < forca) {
                throw new IllegalArgumentException("Atributos invalidos para LADRAO");
            }


    }

    @Override
    public double getDanoAtaque() {
        return (getForca()*0.5) + (getDestreza()*0.35) + (getVigor()*0.1) + (getInteligencia()*0.05);
    }
}
