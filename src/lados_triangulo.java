import java.util.Scanner;
public class lados_triangulo {
    public static void main(String args[]){

        Scanner teclado = new Scanner (System.in);

        System.out.println("diga o primeiro lado do trinagulo: ");
        float ladoum = teclado.nextFloat();

        System.out.println("diga o segundo lado do trinagulo: ");
        float ladodois = teclado.nextFloat();

        System.out.println("diga o terceiro lado do trinagulo: ");
        float ladotres = teclado.nextFloat();

        if ((ladoum + ladodois > ladotres) && (ladotres + ladodois > ladoum) && (ladoum + ladotres > ladodois)) {
            System.out.println("os valores podem formar um trinagulo!");

            if ((ladoum == ladodois) && (ladotres == ladodois)) {
                System.out.println("é um trinagulo equilatero");
            } else if ((ladoum == ladodois) || (ladoum == ladotres) || (ladotres == ladodois)) {
                System.out.println("é um trinagulo isosceles");
            } else {
                System.out.println("é um trinagulo escalenos");
            }
        } else{
            System.out.println("os valores informados não podem formar um triangulo");
        }
    }
}




