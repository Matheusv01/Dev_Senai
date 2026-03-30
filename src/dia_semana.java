import java.util.Scanner;
public class dia_semana {
    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("digite um numero de acordo com o dia da semana: ");
        int semana = teclado.nextInt();

        String situacao;

        if (semana == 1){
            situacao= "domingo";
        }else if (semana == 2){
            situacao= "segunda";
        }else if (semana == 3){
            situacao = "terça";
        } else if (semana == 4){
            situacao = "quarta";
        } else if (semana == 5) {
            situacao = "quinta";
        }else if (semana == 6){
            situacao = "sexta";
        }else if (semana == 7){
            situacao = "sábado";
        }else{
            situacao = "opção invalida";
        }

    System.out.println("o dia da semana é: " + situacao);

    }
}