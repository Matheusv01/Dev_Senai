import java.util.Scanner;

public class reajuste_salario {
    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o salario atual: ");
        double salario = teclado.nextDouble();

        if (salario <= 1000) {
            System.out.println("Aumento de 20%. Novo salario: R$ " + (salario * 1.20));

        } else if (salario <= 1700) {
            System.out.println("Aumento de 15%. Novo salario: R$ " + (salario * 1.15));

        } else if (salario <= 2300) {
            System.out.println("Aumento de 10%. Novo salario: R$ " + (salario * 1.10));

        } else {
            System.out.println("Aumento de 5%. Novo salario: R$ " + (salario * 1.05));
        }
    }
}