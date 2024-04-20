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
        System.out.println("Espírito Ninja");
        System.out.println("Começa a sua aventura no mundo Ninja!");
        System.out.println("Você é um ninja em uma missão para salvar seu mestre.");
        System.out.println("Escolha sabiamente para determinar seu destino e que tipo de ninja você é.");

        // Criar o personagem ninja
        Personagem ninja = new Personagem("Ninja", 100); // Energia inicial do ninja

        // Fases do jogo
        int escolha1, escolha2, escolhaFinal;

        // Primeira fase do jogo
        System.out.println("Você se depara com um vigia do inimigo, mas ele está com a família. O que você faz?");
        System.out.println("1. Ataca todo silenciosamente.");
        System.out.println("2. Passar despercebido.");
        escolha1 = scanner.nextInt();

        // Ação do personagem principal afeta o ninja
        if (escolha1 == 1) {
            ninja.alterarEnergia(-30); // O ninja ataca o vigia
        } else {
            System.out.println("Você passa despercebido.");
        }

        // Segunda fase do jogo
        System.out.println("Você chega no clã rival.");
        System.out.println("Como você aborda a situação?");
        System.out.println("1. Inicia um ataque surpresa para eliminar seus inimigos e todo o povo da vila.");
        System.out.println("2. Oferece uma trégua em troca da liberdade do seu mestre.");
        escolha2 = scanner.nextInt();

        // Ação do personagem principal afeta o ninja
        if (escolha2 == 1) {
            ninja.alterarEnergia(-30); // O ninja inicia um ataque
        } else {
            System.out.println("Você oferece uma trégua.");
        }

        // Terceira fase do jogo, o último confronto
        System.out.println("Você se aproxima do líder inimigo. O que decide fazer?");
        System.out.println("1. Evita o conflito e busca a paz.");
        System.out.println("2. Inicia um combate final para derrotar o líder inimigo.");
        escolhaFinal = scanner.nextInt();

        // Ação do personagem principal afeta o ninja
        if (escolhaFinal == 2) {
            ninja.alterarEnergia(-30); // O ninja inicia o combate final
        } else {
            System.out.println("Você busca a paz e evita o confronto.");
        }

        // Determinar o final da história com base nas escolhas
        if (!isConfronto(escolha1, escolha2, escolhaFinal)) {
            System.out.println("Parabéns! Você é um herói! Todo o seu povo ama você, acabou com a guerra sem machucar o povo inocente.");
        } else if (escolhaFinal == 1 && isConfronto(escolha1, escolha2, escolhaFinal)) {
            System.out.println("Você escolhe perdoar seus inimigos e busca a paz.");
            System.out.println("Seu mestre é libertado, e você segue em busca de redenção.");
            System.out.println("Final de Redenção. Apesar dos seus erros, seguiu em busca da paz espiritual, seu povo o perdoou, e você busca melhorar diariamente.");
        } else {
            System.out.println("Você escolheu o caminho da vingança.");
            System.out.println("Consegue resgatar seu mestre, mas a violência traz consequências.");
            System.out.println("Você se torna um fugitivo, condenado por sua sede de vingança.");
            System.out.println("Final da Vingança. Torna-se uma desonra para seu mestre e seu povo!");
        }

        // Mostrar energia final do ninja
        System.out.println("Energia final do Ninja: " + ninja.getEnergia());

        scanner.close();
    }

    // Método auxiliar para verificar se houve confronto (ataque)
    private static boolean isConfronto(int escolha1, int escolha2, int escolhaFinal) {
        return escolha1 == 1 || escolha2 == 1 || escolhaFinal == 2;
    }
}
