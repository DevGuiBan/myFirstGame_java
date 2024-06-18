public class Personagem{

    //Encapsulamento

    private String nome;
    private double vida;
    private String descricao;

    //Construtor

    public Personagem(String nome, double vida, String descricao){
        this.nome = nome;
        this.vida = vida;
        this.descricao = descricao;
    }

    //Get's

    public String getNome(){
        return nome;
    }

    public double getVida(){
        return vida;
    }

    public String getDescricao(){
        return descricao;
    }
    
    //Set's
    
    public void setVida(double vida) {
        this.vida = vida;
    }
}