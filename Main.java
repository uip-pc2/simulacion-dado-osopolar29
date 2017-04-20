//Alexander Rodriguez oliveros 3-720-2206 trabajo de lanzamiento de un dado y poder salvarte de osopolar29 el corre corre

package dado;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int dado1;
        int punto = 0;
        Scanner en = new Scanner(System.in);
        System.out.println("digite para poder tirar el dado y salvarte de osopolar29");
        en.next();
        System.out.println("Lanzamiento de dado:");
        dado1 = (int) (Math.random() * 6) + 1;
        System.out.println(dado1);
        punto = dado1;
        if (punto == 5 || punto == 6 || punto == 4) {
            System.out.println("tranquilo osopolar29 no te comera vivo");
            System.out.println("Su Punto es: " + punto);
        }
        if (punto == 2 || punto == 3 || punto == 1) {
            System.out.println("Lo siento escondete de osopolar29 porque te buscara y te comera vivo");
            System.out.println("Su Punto es: " + punto);
        }
        System.out.println("digite para poder tirar el dado por segunda ves y salvarte de osopolar29");
        en.next();
        System.out.println("Lanzamiento de dado:");
        dado1 = (int) (Math.random() * 6) + 1;
        System.out.println(dado1);
        punto = dado1;
        if (punto == 5 || punto == 6 || punto == 4) {
            System.out.println("tranquilo osopolar29 no te comera vivo");
            System.out.println("Su Punto es: " + punto);
        }
        if (punto == 2 || punto == 3 || punto == 1) {
            System.out.println("Lo siento escondete de osopolar29 porque te buscara y te comera vivo");
            System.out.println("Su Punto es: " + punto);
        }
            System.out.println("digite para poder tirar el dado por tercera ves y salvarte de osopolar29");
            en.next();
        System.out.println("Lanzamiento de dado:");
            dado1 = (int) (Math.random() * 6) + 1;
            System.out.println(dado1);
            punto = dado1;
            if (punto == 5 || punto == 6 || punto == 4) {
                System.out.println("tranquilo osopolar29 no te comera vivo");
                System.out.println("Su Punto es : " + punto);
            }
            if (punto == 2 || punto == 3 || punto == 1) {
                System.out.print("Lo siento escondete de osopolar29 porque te buscara y te comera vivo");
                System.out.println("Su Punto es : " + punto);
            }

        }
    }




