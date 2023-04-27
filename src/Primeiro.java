import java.util.Scanner;

public class Primeiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanhoVetor = 5;
        int[] vetor = new int[tamanhoVetor];
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.printf("Digite o valor %d de %d: ", i+1, tamanhoVetor);
            vetor[i] = sc.nextInt();
        }
        int soma = 0;
        for (int i = 0; i < tamanhoVetor; i++) {
            soma += vetor[i];
        }
        System.out.println("A soma dos valores é: " + soma);
        sc.close();
    }
}