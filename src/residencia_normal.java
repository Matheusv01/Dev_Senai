import java.util.Scanner;
public class residencia_normal {
    public static void main (String args[]){

        Scanner teclado = new Scanner(System.in);

        System.out.println("qual seu consumo de água em metro cúbicos. (diga somente os numeros): ");
        double  consumo = teclado.nextDouble();

        if (consumo <= 10){
            System.out.println("voce pagará 22,38 pelo seu(s)" +consumo+ "m3");

        }else if (consumo <= 20){
            System.out.println("voce pagará 3,50 por metros cúbicos");

        }else if  (consumo <= 50){
            System.out.println("voce pagará 8,75 por metros cúbicos");

        }else if (consumo > 50){
            System.out.println("voce pagará 9,64 por metros cúbicos");
        }

    }
}



