/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gameWar;
import java.util.Scanner;
/**
 *
 * @author VITHORLEONARDOMELLOS
 */
public class Game {
    private Mago mago;
    private Guerreiro guerreiro;
    private Arqueiro arqueiro;
    private int turno;
    private Scanner sc = new Scanner(System.in);
    private int dificuldade = 0;
    
    public Game(){
        turno = 0;
        mago = new Mago("Biron");
        guerreiro = new Guerreiro("Barbaro");
        arqueiro = new Arqueiro("Cleber");
    }
    
    private void addTurno(){
        mago.turno++;
        guerreiro.turno++;
        arqueiro.turno++;
    }
    /**
     * Retorna true se vencer a batalha e false se perder.
     * @param personagem
     * @param oponente 
     */
    private void oponenteAtaca(Personagem personagem, Personagem oponente){
       int randomNum = (int) (Math.random() * (this.dificuldade + 1));
        
       if(randomNum == 1){
           oponente.atacar(personagem);
       } else{
           oponente.ataqueEspecial(personagem);
       }
    }
    
    private boolean luta(Personagem perso, Personagem oponente){
        Personagem personagem = perso.clone();
        boolean retorno = false;
        
        boolean teste = true;
        while(teste){
            System.out.println(personagem.getStatus());
            System.out.println(oponente.getStatus());
            System.out.println("--------------------------------");
            System.out.println("-             Luta             -");
            System.out.println("--------------------------------");
            System.out.println("- 0. Desistir                  -");
            System.out.println("- 1. Ataque basico             -");
            System.out.println(  "- 2. Ataque especial ("+ personagem.nomeAtaqueEspecial() + ")-");
            System.out.println("- 3. Info                      -");
            System.out.println("--------------------------------");
            
            int opcao = sc.nextInt();
            
            switch(opcao){
                case 0:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Voce desistiu da luta! \n;-;");
                    teste = false;
                    break;
                case 1:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Seu turno:");
                    personagem.atacar(oponente);
                    System.out.println("\nTurno inimigo:");
                    if(oponente.estaVivo() && personagem.estaVivo()){
                        this.oponenteAtaca(personagem, oponente);
                        System.out.println("\nFim do turno:");
                        if(!personagem.estaVivo()){
                            teste = false;
                            System.out.println("\nVoce perdeu!");
                        }
                    } else if(!personagem.estaVivo()){
                        System.out.println("\nVoce morreu!");
                        teste = false;
                    } else{
                        teste = false;
                        retorno = true;
                        System.out.println("\nVoce venceu a batalha!");
                    }
                        break;
                    
                    
                case 2:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
                    if(personagem.turno != 0){
                        System.out.println("\nAtaque não carregado, voce precisa esperar " + personagem.turno + "turnos.");
                    } else {
                        System.out.println("\nSeu turno:");
                        personagem.ataqueEspecial(oponente);
                        System.out.println("\nTurno inimigo:");
                        if(oponente.estaVivo() && personagem.estaVivo()){
                            this.oponenteAtaca(personagem, oponente);
                            System.out.println("\nFim do turno:");
                            if(!personagem.estaVivo()){
                                teste = false;
                                System.out.println("\nVoce perdeu!");
                            }
                        } else if(!personagem.estaVivo()){
                            System.out.println("\nVoce morreu!");
                            teste = false;
                        } else{
                            teste = false;
                            retorno = true;
                            System.out.println("\nVoce venceu a batalha!");
                        }
                    }
                    break;
                case 3:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println(personagem.info());
                    break;
                
            }
        }//ultima alteracao
        return retorno;
    }
    
    public void start(){
        boolean teste = true;
        
        System.out.println("----------------------");
        System.out.println("- Personagem Inicial -");
        System.out.println("----------------------");
        System.out.println("- 1. Easy            -");
        System.out.println("- 2. Facil           -");
        System.out.println("- 3. Normal          -");
        System.out.println("- 4. Mestre          -");
        System.out.println("----------------------");
        
        int opcaoUm = sc.nextInt();
        
        switch(opcaoUm){
            case 1: 
                this.dificuldade = 4;
                break;
            case 2:
                this.dificuldade = 3;
                break;
            case 3:
                this.dificuldade = 2;
                break;
            case 4: 
                this.dificuldade = 1;
                break;
        }
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        while(teste){
            System.out.println("----------------------");
            System.out.println("- Personagem Inicial -");
            System.out.println("----------------------");
            System.out.println("- 1. Mago            -");
            System.out.println("- 2. Guerreiro       -");
            System.out.println("- 3. Arqueiro        -");
            System.out.println("----------------------");

            System.out.println("Digite a opcao: ");
            int opcao = sc.nextInt();
            String nome = "erro em nome";
            sc.nextLine();
            switch(opcao){
                case 1:
                    System.out.println("Digite o nome do Seu personagem: "); // Consome o "\n" deixado por nextInt()
                    nome = sc.nextLine() ;
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    this.menuMapa(new Mago(nome));
                    teste = false;
                    break;
                case 2:
                    System.out.println("Digite o nome do Seu personagem: ");
                    nome = sc.nextLine() ;
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    this.menuMapa(new Guerreiro(nome));
                    teste = false;
                    break;
                case 3:
                    System.out.println("Digite o nome do Seu personagem: ");
                    nome = sc.nextLine() ;
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    this.menuMapa(new Arqueiro(nome));
                    teste = false;
                    break;
                default:
                    System.out.println("Opcao invalida! digite 1,2 ou 3.");
            }
        }
    }
    
    private void menuMapa(Personagem perso){
        boolean teste = true;
        int fase = 1;
        while(teste){
            System.out.println("-------------------------");
            System.out.println("-          Mapa         -");
            System.out.println("-------------------------");
            System.out.println("- 0. Surpresa           -");
            System.out.println("- 1. Floresta           -");
            System.out.println("- 2. Caverna reluzente  -");
            System.out.println("- 3. Castelo            -");
            System.out.println("- 4. Calabouco          -");
            System.out.println("-------------------------");

            int opcao = sc.nextInt();
            switch(opcao){
                case 0:
                    teste = false;
                    break;
                case 1:
                    if(fase == 1){
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("Voce encontrou um arqueiro*");
                        System.out.println("- " + perso.nome + ": Voce tem algo que me pertence!");
                        System.out.println("- Cleber: Esta falando desta chave, elegante explorador(a)? venha pegar, se conseguir...");
                        if(luta(perso, this.arqueiro)){
                            fase++;
                        }
                    } else{
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("Nada alem de arvores!");
                    }
                    break;
                case 2:
                    if(fase == 2){
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("Voce encontra um mago na caverna*");
                        System.out.println("- " + this.mago.nome + ": hahahaha");
                        System.out.println("- " + perso.nome + ": Quem e voce?");
                        System.out.println("- "+ this.mago.nome + ": Nao importa, vamos lutar!");
                        if(luta(perso, this.mago)){
                            System.out.println("- " + mago.nome + ": ah, voce me derrotou!");
                            perso.vida += 20;
                            perso.dano += 5;
                            System.out.println("Você recebeu uma bencao do mago");
                            System.out.println(perso.getStatus());
                        }
                    }else if(fase > 2){
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("Apenas pedras preciosas por aqui, nada que possa ajudar a princesa!");
                    } else{
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("Antes voce precisa passar pela floresta.");
                    }
                    break;
                case 3:
                    if(fase == 3){
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("- " + perso.nome +": Vim aqui resgatar a princesa, nao tenho tempo para conversas");
                        System.out.println("- " + guerreiro.nome + ": ??");
                        if(luta(perso, guerreiro)){
                            fase++;
                        }
                    }else if(fase > 3){
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("Voce ja resgatou a princesa, parabens!");
                    } else{
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("Antes voce precisa passar pela caverna.");
                    }
                    break;
                case 4:
                    if(fase == 4){
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("Voce usa a chave para abrir o calabouco, mas a porta ja estava aberta*");
                        System.out.println("- " + perso.nome + ": Princesa, vim aqui resgatar voce!");
                        System.out.println("- Princesa: O que? quem disse que preciso ser resgatada?");
                        System.out.println("- Princesa: Meu quarto esta em reforma e estou dormindo no calabouco por enquanto.");
                        System.out.println("- Princesa: Falando nisso onde esta meu cavaleiro?");
                        System.out.println("\nmission passed\nrespected -99");
                        teste = false;
                    } else{
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("Voce ainda precisa passar pelo castelo");
                    }
                    break;
            }
        }
    }
    
}
