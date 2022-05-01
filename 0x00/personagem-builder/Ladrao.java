public class Ladrao extends Personagem{


    public Ladrao(String nome, int inteligencia, int forca,  int resistencia, int vigor, int destreza) {
        super(  nome,
                TipoPersonagem.LADRAO,
                inteligencia,
                forca,
                resistencia,
                vigor,
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
