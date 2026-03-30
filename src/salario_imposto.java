import java.util.Scanner;

public class salario_imposto {
    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o valor do seu salário?: ");
        double salario = teclado.nextDouble();

        // Lógica baseada na tabela de IRRF 2023
        if (salario <= 2112.00) {
            System.out.println("Voce esta isento de Imposto de Renda.");

        } else if (salario <= 2826.65) {
            System.out.println("Voce pagara 7,5% de IRRF sobre o valor de R$ " + salario);

        } else if (salario <= 3751.05) {
            System.out.println("Voce pagara 15% de IRRF sobre o valor de R$ " + salario);

        } else if (salario <= 4664.68) {
            System.out.println("Voce pagara 22,5% de IRRF sobre o valor de R$ " + salario);

        } else {
            System.out.println("Voce pagara 27,5% de IRRF sobre o valor de R$ " + salario);
        }

    }
}