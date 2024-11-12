import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class JogoDaForca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavraSecreta = "casa";
        StringBuilder progresso = new StringBuilder("____");
        int tentativas = 6;

        System.out.println("Bem-vindo ao Jogo da Forca!");

        System.out.println("Palavra: " + progresso);
        System.out.println("Tentativas restantes: " + tentativas);

        while (tentativas > 0 && progresso.indexOf("_") != -1) {
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().toLowerCase().charAt(0);

            boolean acertou = false;
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    progresso.setCharAt(i, letra);
                    acertou = true;
                }
            }

            if (!acertou) {
                tentativas--;
                System.out.println("Letra incorreta! Tentativas restantes: " + tentativas);
            } else {
                System.out.println("Boa! Você acertou uma letra.");
            }

            System.out.println("Palavra: " + progresso);
        }

        if (progresso.indexOf("_") == -1) {
            System.out.println("Parabéns! Você adivinhou a palavra: " + palavraSecreta);
        } else {
            System.out.println("Fim de jogo! A palavra era: " + palavraSecreta);
        }

        scanner.close();




    }
}