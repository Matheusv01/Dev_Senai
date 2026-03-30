import java.util.Scanner;
public class seu_imc {
    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("qual a sua altura: ");
        float altura = teclado.nextFloat();

        System.out.println("qual a seu peso: ");
        float peso = teclado.nextFloat();

        float imc = (peso/(altura*altura));
        System.out.println("seu imc é: " + imc);

        String situacao;

        if (imc < 16){
            situacao = "magreza grave";
        }else if (imc < 17){
            situacao = "magro";
        }else if (imc <18.5){
            situacao = "magreza leve";
        }else if (imc < 25){
            situacao = "saudavel";
        }else if (imc < 30){
            situacao = "sobrepeso";
        }else if (imc < 35){
            situacao = "obesidade grau 1";
        }else if (imc < 40){
            situacao = "obesidade grau 2 (severa)";
        }else {
            situacao = "obesidade grau 3 (mórbida)";
        }
        System.out.println("sua situação é: "+situacao);
    }
}