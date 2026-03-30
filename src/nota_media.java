import java.util.Scanner;

public class nota_media {
    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = teclado.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double n3 = teclado.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double n4 = teclado.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("Notas: " + n1 + ", " + n2 + ", " + n3 + ", " + n4);
        System.out.println("Media Final: " + media);

        if (media >= 9.0) {
            System.out.println("Conceito: A");
            System.out.println("SITUACAO: APROVADO");

        } else if (media >= 7.5) {
            System.out.println("Conceito: B");
            System.out.println("SITUACAO: APROVADO");

        } else if (media >= 6.0) {
            System.out.println("Conceito: C");
            System.out.println("SITUACAO: APROVADO");

        } else if (media >= 4.0) {
            System.out.println("Conceito: D");
            System.out.println("SITUACAO: REPROVADO");

        } else {
            System.out.println("Conceito: E");
            System.out.println("SITUACAO: REPROVADO");
        }
    }
}