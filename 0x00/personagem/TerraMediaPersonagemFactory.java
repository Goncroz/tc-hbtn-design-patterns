public class TerraMediaPersonagemFactory extends PersonagemFactory {
    @Override
    public Personagem createPersonagem(TipoPersonagem personagem, String nome){

        if (personagem == TipoPersonagem.MAGO){
            return new Mago(nome,TipoPersonagem.MAGO,10,2,5,3,4);
        }
        else if (personagem == TipoPersonagem.LADRAO){
            return new Ladrao(nome, TipoPersonagem.LADRAO,2,6,8,5,10);
        }
        else if (personagem == TipoPersonagem.GUERREIRO){
            return new Guerreiro(nome,TipoPersonagem.GUERREIRO,1,8,5,10,6);
        }

        return null;
    }

}
