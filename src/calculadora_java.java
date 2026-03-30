import java.util.Scanner;
public class calculadora_java {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = teclado.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = teclado.nextDouble();

        System.out.println("1 - Adição\n 2 - Subtração\n 3 - Multiplicação\n 4 - Divisão\n 5 - Potência\n 6 - Raiz Quadrada\n 7 - Número par\n 8 - Número ímpar");
        System.out.println("Escolha uma opção:");
        int opcao = teclado.nextInt();

        if (opcao == 1) {
            System.out.println("Resultado: " + (num1 + num2));
        } else if (opcao == 2) {
            System.out.println("Resultado: " + (num1 - num2));
        } else if (opcao == 3) {
            System.out.println("Resultado: " + (num1 * num2));
        } else if (opcao == 4) {
            if (num2 != 0) {
                System.out.println("Resultado: " + (num1 / num2));
            } else {
                System.out.println("Erro: Divisão por zero!");
            }
        } else if (opcao == 5) {
            System.out.println("Resultado: " + Math.pow(num1, num2));
        } else if (opcao == 6) {
            System.out.println("Raiz de " + num1 + " é: " + Math.sqrt(num1));
            System.out.println("Raiz de " + num2 + " é: " + Math.sqrt(num2));
        } else if (opcao == 7) {
            if (num1 % 2 == 0) { System.out.println(num1 + " é par"); }
            else { System.out.println(num1 + " não é par"); }
        } else if (opcao == 8) {
            if (num1 % 2 != 0) { System.out.println(num1 + " é ímpar"); }
            else { System.out.println(num1 + " não é ímpar"); }
        } else {
            System.out.println("Opção inválida!");
        }
    }
}