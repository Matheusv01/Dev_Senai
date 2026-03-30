import java.util.Scanner;

public class menu_opcoes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("1 - Opção 1");
        System.out.println("2 - Opção 2");
        System.out.println("3 - Opção 3");
        System.out.println("4 - Sair");
        System.out.println("Digite uma opção: ");

        int opcao = teclado.nextInt();

        if (opcao == 1) {
            System.out.println("Você selecionou a opção 1");
        } else if (opcao == 2) {
            System.out.println("Você selecionou a opção 2");
        } else if (opcao == 3) {
            System.out.println("Você selecionou a opção 3");
        } else if (opcao == 4) {
            System.out.println("Você selecionou sair");
        } else {
            System.out.println("Opção inválida!!!");
        }

        System.out.println("Fim do programa!");
    }
}