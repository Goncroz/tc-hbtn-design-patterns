public class Mago extends Personagem{



    public Mago(String nome, int inteligencia, int forca,  int resistencia, int vigor, int destreza) {
        super(  nome,
                TipoPersonagem.MAGO,
                inteligencia,
                forca,
                resistencia,
                vigor,
                destreza);

          if (inteligencia < forca && inteligencia < destreza) {
              throw new IllegalArgumentException("Atributos invalidos para MAGO");

          }

    }

    @Override
    public double getDanoAtaque() {
        return (getInteligencia()*0.8) + (getForca()*0.05) + (getDestreza()*0.05) + (getVigor()*0.1);
    }
}