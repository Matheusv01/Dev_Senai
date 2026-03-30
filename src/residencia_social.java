import java.util.Scanner;
public class residencia_social {
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        System.out.println("qual seu consumo de água em metro cúbicos. (diga somente os numeros): ");
        double  consumo = teclado.nextDouble();

        if (consumo <= 10){
            System.out.println("voce pagará 7,59 pelo seu(s)" +consumo+ "m3");

        }else if (consumo >= 20){
            System.out.println("voce pagará 1,31 por metros cúbicos");

        }else if  (consumo >= 30){
            System.out.println("voce pagará 4,64 por metros cúbicos");

        }else if  (consumo >= 50){
            System.out.println("voce pagará 6,62 por metros cúbicos");
        }

    }
}



