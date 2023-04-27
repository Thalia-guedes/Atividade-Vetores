import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
        String[] alunos = new String[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do aluno " + (i+1) + ": ");
            alunos[i] = scanner.nextLine();
        }

        System.out.println("\nLista de Chamada:");

        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + ". " + alunos[i]);
        }
    }
}