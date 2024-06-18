//'extends' usado para herdar os atributos da classe personagem

public class CajadoArcano extends Armas{

    public CajadoArcano(String nome, double dano, String descricao, String hb1Descricao, double hb1, String hb2Descricao, double hb2){
        super(nome, dano, descricao, hb1Descricao, hb1, hb2Descricao, hb2);
    }
}
