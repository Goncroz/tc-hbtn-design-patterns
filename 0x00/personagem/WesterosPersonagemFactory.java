public class WesterosPersonagemFactory extends PersonagemFactory{
    @Override
    public Personagem createPersonagem(TipoPersonagem personagem, String nome) {
        if (personagem == TipoPersonagem.MAGO){
            return new Mago(nome,TipoPersonagem.MAGO,8,3,3,3,4);
        }
        else if(personagem == TipoPersonagem.LADRAO){
            return new Ladrao(nome,TipoPersonagem.LADRAO,1,8,7,7,10);
        }
        else if(personagem == TipoPersonagem.GUERREIRO){
            return new Guerreiro(nome,TipoPersonagem.GUERREIRO,0,9,7,10,7);
        }

        return null;
    }
}
