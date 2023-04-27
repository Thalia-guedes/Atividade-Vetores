import java.util.Scanner;

public class Quinto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome da banda musical: ");
        String nomeBanda = input.nextLine();

        String[] musicas = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome da " + (i+1) + "ª música: ");
            musicas[i] = input.nextLine();
        }

        System.out.println("\n" + nomeBanda);
        for (String musica : musicas) {
            System.out.println(musica);
        }
    }
}