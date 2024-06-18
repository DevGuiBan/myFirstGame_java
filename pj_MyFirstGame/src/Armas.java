public class Armas {

    //Encapsulamento

    private String nome;
    private double dano;
    private String descricao;
    private String hb1Descricao;
    private double hb1;
    private String hb2Descricao;
    private double hb2;

    //Construtor

    public Armas(String nome, double dano, String descricao,String hb1Descricao, double hb1,String hb2Descricao, double hb2){
        this.nome = nome;
        this.dano = dano;
        this.descricao = descricao;
        this.hb1Descricao = hb1Descricao;
        this.hb1 = hb1;
        this.hb2Descricao = hb2Descricao;
        this.hb2 = hb2;
    }

    //Get's

    public String getNome(){
        return nome;
    }

    public double getDano(){
        return dano;
    }

    public String getDescricao(){
        return descricao;
    }

    public String getHb1Descricao(){
        return hb1Descricao;
    }

    public double getHb1(){
        return hb1;
    }

    public String getHb2Descricao(){
        return hb2Descricao;
    }

    public double getHb2(){
        return hb2;
    }
}
