import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ninja1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Espírito Ninja");
        System.out.println("Começa a sua aventura no mundo Ninja!");
        System.out.println("Você é um ninja em uma missão para salvar seu mestre.");
        System.out.println("Escolha sabiamente para determinar seu destino e que tipo de ninja você é.");

        List<Integer> escolhas = new ArrayList<>();

        // Primeira faze do game. 
        System.out.println("Você se depara com um vigia do inimigo, mas ele tá com a família. O que você faz?");
        System.out.println("1. Ataca toddo silenciosamente.");
        System.out.println("2. Passar despercebido.");
        int escolha1 = scanner.nextInt();
        escolhas.add(escolha1);

        // Segunda fase do game.
        System.out.println("Você chega no clã rival.");
        System.out.println("Como você aborda a situação?");
        System.out.println("1. Inicia um ataque surpresa para eliminar seus inimigos e todo o povo da vila .");
        System.out.println("2. Oferece uma trégua em troca da liberdade do seu mestre.");
        int escolha2 = scanner.nextInt();
        escolhas.add(escolha2);

        // Terceira fase do game , o ultimo comfronto.
        System.out.println("Você se aproxima do líder inimigo. O que decide fazer?");
        System.out.println("1. Evita o conflito e busca a paz.");
        System.out.println("2. Inicia um combate final para derrotar o líder inimigo.");
        int escolhaFinal = scanner.nextInt();
        escolhas.add(escolhaFinal);

        // Resultado final , que tipo de ninja você é ? 
        if (!escolhas.contains(1)) {
            System.out.println("Parabéns! Você é um herói! Todo o seu povo ama você, acabou com o lider inimigo sem mechucar o povo inocente.");
        } else if (escolhas.get(escolhas.size() - 1) == 1 && escolhas.contains(1)) {
            System.out.println("Você escolhe perdoar seus inimigos e busca a paz.");
            System.out.println("Seu mestre é libertado, e você segue em busca de redenção.");
            System.out.println("Final de Redenção. Apesar dos seus erros, seguiu em busca da paz espiritual , seu povo o perduo, e você busca melhorar diariamente.");
        } else {
            System.out.println("Você escolheu o caminho da vingança.");
            System.out.println("Consegue resgatar seu mestre, mas a violência traz consequências.");
            System.out.println("Você se torna um fugitivo, condenado por sua sede de vingança.");
            System.out.println("Final da Vingança. Torna-se uma desonra para seu mestre e seu povo!");
        }

        scanner.close();
    }
}

