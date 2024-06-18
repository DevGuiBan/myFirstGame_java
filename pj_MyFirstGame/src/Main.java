import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Os Aventureiros

        Scanner scanner = new Scanner(System.in);

        //Personagens

        Cavaleiro cava = new Cavaleiro("Cavaleiro", 200, "Com sua grande defesa fará a linha de frente em batalha");
        Arqueiro arq = new Arqueiro("Arqueiro", 150, "A sombra que irá perfurar seus inimigos antes que eles deêm conta de sua existência.");
        Mago mago = new Mago("Mago", 100, "Assumindo a retaguarda, usará suas fortes magias para destruir seus inimigos.");

        //Armas

        //override usado na descrição que está sendo sobreescrita da classe pai na classe filha

        EspadaSagrada esp = new EspadaSagrada("Espada Sagrada", 10, "Feita por um ferreiro iniciante nas artes santas, mas não deixa de ser uma boa arma.", "Corte Purificador", 25, "Explosao Santa", 50);
        ArcoDeGelo arc = new ArcoDeGelo("Arco de Gelo", 20, "Feita pelo Hobit da floresta escura, ele não colocou vontade em sua construção, mas embuiu uma pedra arcana com propriedades gelidas.", "Flecha de Gelo", 40, "Saraivada de Flechas", 50);
        CajadoArcano caj = new CajadoArcano("Cajado Arcano", 25, "Um cajado de madeira com uma pedra arcana em seu topo imbuida com forte poder arcano.", "Bola de fogo", 60, "Explosao Arcana", 70);

        //Escolha de personagens

        System.out.println("1 - Cavaleiro\n" + cava.getDescricao());
        System.out.println("\n2 - Arqueiro\n" + arq.getDescricao());
        System.out.println("\n3 - Mago\n" + mago.getDescricao());

        System.out.print("\nPlayer - 1 || Escolha seu personagem para a batalha: ");
        int p1 = scanner.nextInt();

        System.out.print("\nPlayer - 2 || Escolha seu personagem para a batalha: ");
        int p2 = scanner.nextInt();

        //Escolha de armas

        System.out.println("\n\n1 - Espada Sagrada\n" + esp.getDescricao());
        System.out.println("\n2 - Arco De Gelo\n" + arc.getDescricao());
        System.out.println("\n3 - Cajado Arcano\n" + caj.getDescricao());

        System.out.print("\nPlayer - 1 || Escolha sua arma para a batalha: ");
        int arm1 = scanner.nextInt();

        System.out.print("\nPlayer - 2 || Escolha sua arma para a batalha: ");
        int arm2 = scanner.nextInt();

        Personagem gamer1 = null;
        Personagem gamer2 = null;

        if(p1 == 1){
            gamer1 = cava;
        } else if(p1 == 2){
            gamer1 = arq;
        } else if(p1 == 3){
            gamer1 = mago;
        }

        if(p2 == 1){
            gamer2 = cava;
        } else if(p2 == 2){
            gamer2 = arq;
        } else if(p2 == 3){
            gamer2 = mago;
        }

        Armas wepGamer1 = null;
        Armas wepGamer2 = null;

        if(arm1 == 1){
            wepGamer1 = esp;
        } else if(arm1 == 2){
            wepGamer1 = arc;
        } else if(arm1 == 3){
            wepGamer1 = caj;
        }

        if(arm2 == 1){
            wepGamer2 = esp;
        } else if(arm2 == 2){
            wepGamer2 = arc;
        } else if(arm2 == 3){
            wepGamer2 = caj;
        }

    //Batalha - dedução de vida até um dos player's ser derrotado

    /* 
     * variável wepGamer1 pode ser do tipo EspadaSagrada, 
     * ArcoDeGelo ou CajadoArcano. O código 
     * funciona da mesma forma independentemente do tipo da arma.
    */
        
    while (gamer1.getVida() > 0 && gamer2.getVida() > 0) {
    System.out.println("Player - 1");
    System.out.println("_____________________________");
    System.out.println("1 - " + wepGamer1.getHb1Descricao());
    System.out.println("2 - " + wepGamer1.getHb2Descricao());
    System.out.println("_____________________________");
    System.out.print("Escolha sua habilidade para atacar: ");

    int habilidade1 = scanner.nextInt();

    System.out.println("Player - 2");
    System.out.println("_____________________________");
    System.out.println("1 - " + wepGamer2.getHb1Descricao());
    System.out.println("2 - " + wepGamer2.getHb2Descricao());
    System.out.println("_____________________________");
    System.out.print("Escolha sua habilidade para atacar: ");

    int habilidade2 = scanner.nextInt();


    //'?' operador condicional ternário

    /* 
     * Se a condição for verdadeira, o dano causado será o valor do getHb1()
     * Se a condição for falsa, o dano causado será o valor do getHb2()
     * obviamente não há como adicionar mais uma habilidade, 
     * se for adicionar é necessário criar um 'if else'.
     */
    double danoJogador1 = (habilidade1 == 1) ? wepGamer1.getHb1() : wepGamer1.getHb2();
    double danoJogador2 = (habilidade2 == 1) ? wepGamer2.getHb1() : wepGamer2.getHb2();    

    gamer1.setVida(gamer1.getVida() - danoJogador2);
    gamer2.setVida(gamer2.getVida() - danoJogador1);    

    System.out.println("_____________________________");
    System.out.println("Vida do Player 1: " + gamer1.getVida());
    System.out.println("Vida do Player 2: " + gamer2.getVida());
    System.out.println("_____________________________");
}
        
        if (gamer1.getVida() <= 0) {
            System.out.println("Player 2 venceu!");
        } else {
            System.out.println("Player 1 venceu!");
        }
        scanner.close();
    }
}