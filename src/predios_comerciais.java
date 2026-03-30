import java.util.Scanner;
public class predios_comerciais  {
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        System.out.println("qual seu consumo de água em metro cúbicos. (diga somente os numeros): ");
        double  consumo = teclado.nextDouble();

        if (consumo <= 10){
            System.out.println("voce pagará 44,95 pelo seu(s)" +consumo+ "m3");

        }else if (consumo >= 20){
            System.out.println("voce pagará 8,75 por metros cúbicos");

        }else if  (consumo >= 30){
            System.out.println("voce pagará 16,75 por metros cúbicos");

        }else if  (consumo >= 50){
            System.out.println("voce pagará 17,46 por metros cúbicos");
        }

    }
}



