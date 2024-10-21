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
    
    private boolean luta(Personagem perso, Personagem oponente){
        Personagem personagem = perso.clone();
        boolean retorno= false;
        
        boolean teste = true;
        while(teste){
            System.out.print(personagem.getStatus());
            System.out.print("----------------------");
            System.out.print("-        Luta        -");
            System.out.print("----------------------");
            System.out.print("- 0. Desistir        -");
            System.out.print("- 1. Ataque basico   -");
            System.out.print("- 2. Ataque especial -");
            System.out.print("----------------------");
            
            int opcao = sc.nextInt();
            
            switch(opcao){
                case 1:
                    
                    break;
            }
        }
        return retorno;
    }
    
    private void start(){
        boolean teste = true;
        while(teste){
            System.out.print("----------------------");
            System.out.print("- Personagem Inicial -");
            System.out.print("----------------------");
            System.out.print("- 1. Mago            -");
            System.out.print("- 2. Guerreiro       -");
            System.out.print("- 3. Arqueiro        -");
            System.out.print("----------------------");

            System.out.print("Digite a opcao: ");
            int opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    System.out.print("Digite o nome do Seu personagem: ");
                    this.menuMapa(new Mago(sc.nextLine()));
                    teste = false;
                    break;
                case 2:
                    System.out.print("Digite o nome do Seu personagem: ");
                    this.menuMapa(new Guerreiro(sc.nextLine()));
                    teste = false;
                    break;
                case 3:
                    System.out.print("Digite o nome do Seu personagem: ");
                    this.menuMapa(new Arqueiro(sc.nextLine()));
                    teste = false;
                    break;
                default:
                    System.out.print("Opcao invalida! digite 1,2 ou 3.");
            }
        }
    }
    
    private void menuMapa(Personagem perso){
        boolean teste = true;
        int fase = 1;
        while(teste){
            System.out.print("-------------------------");
            System.out.print("-          Mapa         -");
            System.out.print("-------------------------");
            System.out.print("- 0. voltar             -");
            
            if(!(perso instanceof Arqueiro)){
            System.out.print("- 1. Floresta           -");
            }
            if(!(perso instanceof Mago)){
            System.out.print("- 2. Caverna reluzente  -");
            }
            if(!(perso instanceof Guerreiro)){
            System.out.print("- 3. Castelo            -");
            }
            System.out.print("- 4. Calabouco          -");
            System.out.print("-------------------------");

            int opcao = sc.nextInt();
            switch(opcao){
                case 0:
                    teste = false;
                    break;
                case 1:
                    if(fase == 1){
                        System.out.print("Voce encontrou um arqueiro*");
                        System.out.print("- " + perso.nome + ": Voce tem algo que me pertence!");
                        System.out.print("- Cleber: Esta falando destas chaves elegante explorador(a)!");
                        System.out.print("- Cleber: venha pegar se conseguir...");
                        if(luta(perso, this.arqueiro)){
                            fase++;
                        }
                    } else{
                        System.out.print("Nada alem de arvores!");
                    }
                    break;
                case 2:
                    if(fase == 2){
                        System.out.print("Voce encontra um mago na caverna*");
                        System.out.print("- " + this.mago.nome + ": hahahaha");
                        System.out.print("- " + perso.nome + ": Quem e voce?");
                        System.out.print("- "+ this.mago.nome + ": Nao importa, vamos lutar!");
                        if(luta(perso, this.mago)){
                            System.out.print("- " + mago.nome + ": ah, voce me derrotou!");
                            perso.vida += 20;
                            perso.dano += 5;
                            System.out.print("Você recebeu uma bencao do mago");
                            System.out.print(perso.getStatus());
                        }
                    }else if(fase > 2){
                        System.out.print("Apenas pedras preciosas por aqui, nada que possa ajudar a princesa!");
                    } else{
                        System.out.print("Antes voce precisa passar pela floresta.");
                    }
                    break;
                case 3:
                    if(fase == 3){
                        System.out.print("- " + perso.nome +": Vim aqui resgatar a princesa, nao tenho tempo para conversas");
                        System.out.print("- " + guerreiro.nome + ": ??");
                        if(luta(perso, guerreiro)){
                            fase++;
                        }
                    }else if(fase > 3){
                        System.out.print("Voce ja resgatou a princesa, parabens!");
                    } else{
                        System.out.print("Antes voce precisa passar pela caverna.");
                    }
                    break;
                case 4:
                    if(fase == 4){
                        System.out.print("Voce usa a chave para abrir o calabouco, mas a porta ja estava aberta*");
                        System.out.print("- " + perso.nome + ": Princesa, vim aqui resgatar voce!");
                        System.out.print("- Princesa: O que? quem disse que preciso ser resgatada?");
                        System.out.print("- Princesa: Meu quarto esta em reforma e estou dormindo no calabouco por enquanto.");
                        System.out.print("- Princesa: Falando nisso onde esta meu cavaleiro?");
                        System.out.print("\nmission passed\nrespected -99");
                        teste = false;
                    } else{
                        System.out.print("Voce ainda precisa passar pelo castelo");
                    }
                    break;
            }
        }
    }
    
}
