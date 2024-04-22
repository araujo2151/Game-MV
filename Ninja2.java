import java.util.Scanner;

// Definição da classe Personagem
class Personagem {
    private String nome;
    private int energia;

    // Construtor para inicializar o personagem com nome e energia
    public Personagem(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
    }

    // Método para mostrar a energia do personagem
    public int getEnergia() {
        return energia;
    }

    // Método para alterar a energia do personagem com um delta
    public void alterarEnergia(int delta) {
        this.energia += delta;
        if (this.energia <= 0) {
            System.out.println(this.nome + " ficou esgotado e pereceu.");
            this.energia = 0; // A energia não deve ficar negativa
        } else if (this.energia > 100) {
            this.energia = 100; // A energia não deve ultrapassar 100
        }
    }
}

public class Ninja2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------Espírito Ninja----------");
        System.out.println("Começa a sua aventura no mundo Ninja!");
        System.out.println("Você é um ninja do Clã Kaido em uma missão para salvar seu mestre ,Silvrs Rayleigh. Ele foi rapitado pelo inimigo do Clã Dos Revolucionários , seu lider é  Monkey D. Dragon, ele é um tirano perveço, que está planejando gerar uma guerra.");
        System.out.println("Escolha sabiamente as suas decisões para determinar seu destino e que tipo de ninja você vai se tornar.");

        // Criar o personagem ninja
        Personagem ninja = new Personagem("Ninja", 100); // Energia inicial do ninja

        // Fases do jogo
        int escolha1, escolha2, escolhaFinal;

        // Primeira fase do jogo
        System.out.println("Você se depara com um integrante do Clã Dos Revolucionários , mas ele está desarmado e com a família em uma pescaria . O que você faz?");
        System.out.println("1.Atacalo e ter que matar toda a sua família, para que possa se manter em segredo no territorio inimigo silenciosamente.");
        System.out.println("2.Passar despercebido pela bosque e correr os riscos sombrios, onde muitos não voltão de lá . ");
        escolha1 = scanner.nextInt();

        // Ação do personagem principal afeta o ninja
        if (escolha1 == 1) {
            ninja.alterarEnergia(-30); // O ninja ataca o vigia
        } else {
            System.out.println("Você passa despercebido pelo bosque.");
        }

        // Segunda fase do jogo
        System.out.println("Você chega no clã revolucionários.");
        System.out.println("Como você aborda a situação?");
        System.out.println("1. Inicia um ataque surpresa para eliminar seus inimigos e todo o povo da vila deixando um rio de sangue, matado todos sem nenhuma hesitação, e incendiando as cabanas e envenenando a água .");
        System.out.println("2. Oferece uma trégua, com a promeça que não realiziria mas ataques ao o Clã  Dos revolucionários em troca da liberdade do seu mestre e de um encontro com Monkey D. Dragon.");
        escolha2 = scanner.nextInt();

        // Ação do personagem principal afeta o ninja
        if (escolha2 == 1) {
            ninja.alterarEnergia(-30); // O ninja inicia um ataque
        } else {
            System.out.println("Você oferece uma trégua.");
        }

        // Terceira fase do jogo, o último confronto
        System.out.println("Chegou o grande dia, cara a cara com Monkey D. Dragon, qual vai ser a sua decisão final? ");
        System.out.println("1. Evita o conflito, podendo ter chance de uma possivel revolta dos seus inimgos. Mas busca a paz e união dos Clãs instaveis.");
        System.out.println("2. Inicia um combate final para derrotar Monkey D. Dragon o líder tirano .");
        escolhaFinal = scanner.nextInt();

        // Ação do personagem principal afeta o ninja
        if (escolhaFinal == 2) {
            ninja.alterarEnergia(-30); // O ninja inicia o combate final
        } else {
            System.out.println("Você busca a paz e evita o confronto.");
        }

        // Determinar o final da história com base nas escolhas
        if (!isConfronto(escolha1, escolha2, escolhaFinal)) {
            System.out.println("Parabéns! Você é um herói! Todo o seu povo ama você, acabou com o lider tirano  sem machucar o povo inocente, mostrando a honra para o inimigo e com isso o Clã Dos Revolucionários firzerão um acordo de paz .");
        } else if (escolhaFinal == 1 && isConfronto(escolha1, escolha2, escolhaFinal)) {
            System.out.println("Você escolhe perdoar seus inimigos e busca a paz.");
            System.out.println("Seu mestre é libertado, e você segue em busca de redenção.");
            System.out.println("Final de Redenção. Apesar das decisões tomadas, seguiu em busca da paz espiritual, fazendo com que deixase Monckey D. Dragon vivo. Seu povo o perduo pelas suas pervercidades, pois reconheceu seu arrependimento. Assim você prega a paz nos outros Clãs e ajuda a resolver conflitos sem a violencia .");
        } else {
            System.out.println(" escolheu o caminho da vingança.Pois, não conseguiu enxerga que Monkey D. Dragon queria a guerra!Você");
            System.out.println("Consegue resgatar seu mestre, mas a violência traz consequências.");
            System.out.println("Você se torna um fugitivo, condenado por sua sede de vingança. Onde o seu proprio povo o despresa por ser responsavel pro promover e incluir o seu povo a grande guerra!");
            System.out.println("Vive na floresta fugindo, e lutando com os caçadores de recompença e cada vez mas ferido pelo seus inimigos, berando cada vez mas a morte. ");
        }

        // Mostrar energia final do ninja
        System.out.println("Diacordo com suas batalhas a sua energia final é : " + ninja.getEnergia());

        scanner.close();
    }

    // Método auxiliar para verificar se houve confronto (ataque)
    private static boolean isConfronto(int escolha1, int escolha2, int escolhaFinal) {
        return escolha1 == 1 || escolha2 == 1 || escolhaFinal == 2;
    }
}
