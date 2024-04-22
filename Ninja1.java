import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ninja1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------Espírito Ninja----------");
        System.out.println("Começa a sua aventura no mundo Ninja!");
        System.out.println("Você é um ninja do Clã Kaido em uma missão para salvar seu mestre ,Silvrs Rayleigh. Ele foi rapitado pelo inimigo do Clã Dos Revolucionários , seu lider é  Monkey D. Dragon, ele é um tirano perveço, que está planejando gerar uma guerra.");
        System.out.println("Escolha sabiamente as suas decisões para determinar seu destino e que tipo de ninja você vai se tornar.");

        List<Integer> escolhas = new ArrayList<>();

        // Primeira faze do game. 
        System.out.println("Você se depara com um integrante do Clã Dos Revolucionários , mas ele está desarmado e com a família em uma pescaria . O que você faz?");
        System.out.println("1. Atacalo e ter que matar toda a sua família, para que possa se manter em segredo no territorio inimigo silenciosamente.");
        System.out.println("2. Passar despercebido pela bosque e correr os riscos sombrios, onde muitos não voltão de lá .");
        int escolha1 = scanner.nextInt();
        escolhas.add(escolha1);

        // Segunda fase do game.
        System.out.println("Você chega no clã Dos Revolucionários .");
        System.out.println("Como você aborda a situação?");
        System.out.println("1. Inicia um ataque surpresa para eliminar seus inimigos e todo o povo da vila deixando um rio de sangue, matado todos sem nenhuma hesitação, e incendiando as cabanas e envenenando a água .");
        System.out.println("2. Oferece uma trégua, com a promeça que não realiziria mas ataques ao o Clã  Dos revolucionários em troca da liberdade do seu mestre e de um encontro com Monkey D. Dragon.");
        int escolha2 = scanner.nextInt();
        escolhas.add(escolha2);

        // Terceira fase do game , o ultimo comfronto.
        System.out.println("Chegou o grande dia, o encontro com Monkey D. Dragon, qual vai ser a sua decisão final? ");
        System.out.println("1.Evita o conflito, podendo ter chance de uma possivel revolta dos seus inimgos. Mas busca a paz e união dos Clãs.");
        System.out.println("2. Inicia um combate final para derrotar Monkey D. Dragon o líder tirano .");
        int escolhaFinal = scanner.nextInt();
        escolhas.add(escolhaFinal);

        // Resultado final , que tipo de ninja você é ? 
        if (!escolhas.contains(1)) {
            System.out.println("Parabéns! Você é um herói! Todo o seu povo o ama, acabou com o lider tirano sem machucar o povo inocente, mostrando a honra para o inimigo e com isso o Clã Dos Revolucionários firzerão um acordo de paz .");
        
        } else if (escolhas.get(escolhas.size() - 1) == 1 && escolhas.contains(1)) {
            System.out.println("Você escolhe perdoar seus inimigos e busca a paz.");
            System.out.println("Seu mestre é libertado, e você segue em busca de redenção.");
            System.out.println("Final de Redenção. Apesar das decisões tomadas, seguiu em busca da paz espiritual, fazendo com que deixa-se Monckey D. Dragon vivo. Seu povo o perduo pelas suas pervercidades, pois reconheceu o seu arrependimento. Assim você segue prega a paz nos outros Clãs e ajuda a resolver conflitos sem a violencia .");
        
        } else {
            System.out.println(" Escolheu o caminho da vingança.Pois, não conseguiu enxerga que Monkey D. Dragon queria iniciar a grande guerra!");
            System.out.println("você  conseguiu resgatar seu mestre, mas a violência traz consequências.");
            System.out.println("Você se torna um fugitivo, condenado por sua sede de vingança. Onde o seu proprio povo o despresa por ser responsavel pro promover e incluir o seu povo a grande guerra!");
            System.out.println("Vive no bosque foragindo e lutando com os caçadores de recompença, cada vez mas ferido pelo seus inimigos, berando cada vez mas a morte. ");
        }

        scanner.close();
    }
}