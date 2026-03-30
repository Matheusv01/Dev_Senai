import java.util.Scanner;

public class turno_estudo {
    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Em que turno voce estuda? ");
        System.out.println("Digite: M-Matutino, V-Vespertino ou N-Noturno");
        String turno = teclado.next();

        if (turno.equals("M")) {
            System.out.println("Bom Dia!");

        } else if (turno.equals("V")) {
            System.out.println("Boa Tarde!");

        } else if (turno.equals("N")) {
            System.out.println("Boa Noite!");

        } else {
            System.out.println("Valor Invalido!");
        }
    }
}