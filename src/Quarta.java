import java.util.ArrayList;
import java.util.Scanner;

public class Quarta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeCompras = new ArrayList<String>();

        System.out.print("Quantos itens você quer adicionar na lista de compras? ");
        int quantidadeDeItens = scanner.nextInt();

        for (int i = 0; i < quantidadeDeItens; i++) {
            System.out.print("Digite o nome do produto #" + (i + 1) + ": ");
            String produto = scanner.next();
            listaDeCompras.add(produto);
        }

        System.out.println("Sua lista de compras:");
        for (String produto : listaDeCompras) {
            System.out.println(produto);
        }
    }
}